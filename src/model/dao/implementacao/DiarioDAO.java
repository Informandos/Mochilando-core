/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.interfaces.InterfaceDiarioDAO;
import model.dao.interfaces.InterfaceUsuarioDAO;
import model.domain.Cidade;
import model.domain.Diario;
import model.domain.Estado;
import model.domain.Usuario;
import model.excecao.ExcessaoPersistencia;
import util.db.ConnectionManager;

/**
 *
 * @author Juliana
 */
public class DiarioDAO implements InterfaceDiarioDAO {

    @Override
    public Long inserir(Diario diario) {
        if (diario == null) {
            try {
                throw new ExcessaoPersistencia("Diario nao pode ser null");
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Long codDiario = null;

        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO diario (cod_usuario, nom_diario, dat_publicacao, dat_inicio_viagem, dat_fim_viagem, txt_Diario) "
                    + "VALUES(?,?,?,?,?,?) RETURNING cod_diario";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setLong(1, diario.getUsuario().getCodUsuario());
            pstmt.setString(2, diario.getNomDiario());
            pstmt.setDate(3, new java.sql.Date(diario.getDatPublicacao().getTime()));
            pstmt.setDate(4, new java.sql.Date(diario.getDatInicioViagem().getTime()));
            pstmt.setDate(5, new java.sql.Date(diario.getDatFimViagem().getTime()));
            pstmt.setString(6, diario.getTxtDiario());

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                codDiario = rs.getLong("cod_diario");
            }

            rs.close();
            pstmt.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException ex) {
            try {
                throw new ExcessaoPersistencia(ex);
            } catch (ExcessaoPersistencia ex1) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return codDiario;
    }

    @Override
    public boolean alterar(Diario diario) {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE diario "
                    + "   SET cod_usuario = ?, "
                    + "       nom_diario = ?, "
                    + "       dat_publicacao = ?, "
                    + "       dat_inicio_viagem = ?, "
                    + "       dat_fim_viagem = ?, "
                    + "       txt_diario= ?, "
                    + " WHERE cod_diario = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setLong(1, diario.getUsuario().getCodUsuario());
            pstmt.setString(2, diario.getNomDiario());
            pstmt.setDate(3, new java.sql.Date(diario.getDatPublicacao().getTime()));
            pstmt.setDate(4, new java.sql.Date(diario.getDatInicioViagem().getTime()));
            pstmt.setDate(5, new java.sql.Date(diario.getDatFimViagem().getTime()));
            pstmt.setString(6, diario.getTxtDiario());

            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

        } catch (Exception e) {
            try {
                throw new ExcessaoPersistencia(e);
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return true;
    }

    @Override
    public boolean excluir(Diario diario) {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM diario WHERE cod_diario = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, diario.getCodDiario());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new ExcessaoPersistencia(e);
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    @Override
    public Diario consultarDiarioPorId(Long codDiario) {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM Diario WHERE cod_diario = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, codDiario);
            ResultSet rs = pstmt.executeQuery();

            Diario diario = null;
            InterfaceUsuarioDAO usuarioDAO = new UsuarioDAO();
            if (rs.next()) {
                diario = new Diario();
                diario.setCodDiario(rs.getLong("cod_diario"));
                Usuario usuario;
                usuario = usuarioDAO.consultarUsuarioPorId(rs.getLong("cod_usuario"));
                diario.setUsuario(usuario);
                diario.setNomDiario(rs.getString("nom_diario"));
                diario.setDatPublicacao(rs.getDate("dat_publicacao"));
                diario.setDatInicioViagem(rs.getDate("dat_inicio_viagem"));
                diario.setDatFimViagem(rs.getDate("dat_fim_viagem"));
                diario.setTxtDiario(rs.getString("txt_diario"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return diario;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new ExcessaoPersistencia(e);
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public List<Diario> listarTudo() {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM diario ORDER BY nom_diario";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Diario> listarTudo = null;
            InterfaceUsuarioDAO UsuarioDAO = new UsuarioDAO();
            if (rs.next()) {
                listarTudo = new ArrayList<>();
                do {
                    Diario diario = new Diario();
                    diario.setCodDiario(rs.getLong("cod_diario"));
                    Usuario usuario = UsuarioDAO.consultarUsuarioPorId(rs.getLong("cod_usuario"));
                    diario.setUsuario(usuario);
                    diario.setNomDiario(rs.getString("nom_diario"));
                    diario.setDatPublicacao(rs.getDate("dat_publicacao"));
                    diario.setDatInicioViagem(rs.getDate("dat_inicio_viagem"));
                    diario.setDatFimViagem(rs.getDate("dat_fim_viagem"));
                    diario.setTxtDiario(rs.getString("txt_diario"));

                    listarTudo.add(diario);
                } while (rs.next());

            }

            rs.close();
            pstmt.close();
            connection.close();

            return listarTudo;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new ExcessaoPersistencia(e);
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public List<Diario> listarPorUsuario(Usuario usuario) {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM diario WHERE cod_usuario = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, usuario.getCodUsuario());
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Diario> listarPorUsuario = null;
            if (rs.next()) {
                listarPorUsuario = new ArrayList<>();
                do {
                    Diario diario = new Diario();
                    diario.setCodDiario(rs.getLong("cod_diario"));
                    diario.setUsuario(usuario);
                    diario.setNomDiario(rs.getString("nom_diario"));
                    diario.setDatPublicacao(rs.getDate("dat_publicacao"));
                    diario.setDatInicioViagem(rs.getDate("dat_inicio_viagem"));
                    diario.setDatFimViagem(rs.getDate("dat_fim_viagem"));
                    diario.setTxtDiario(rs.getString("txt_diario"));

                    listarPorUsuario.add(diario);
                } while (rs.next());

            }

            rs.close();
            pstmt.close();
            connection.close();

            return listarPorUsuario;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new ExcessaoPersistencia(e);
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public List<Diario> listarPorCidade(Cidade cidade) {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT A.* FROM diario A "
                    + "JOIN dia B ON A.cod_diario = B.cod_diario "
                    + "JOIN dia_atracao C ON B.seq_dia = C.seq_dia "
                    + "JOIN atracao D ON C.seq_atracao = D.seq_atracao "
                    + "JOIN cidade E ON D.cod_cidade_atracao = E.cod_cidade "
                    + "WHERE E.cod_cidade = ? "
                    + "GROUP BY 1;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cidade.getCodCidade());
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Diario> listarPorCidade = null;
            InterfaceUsuarioDAO UsuarioDAO = new UsuarioDAO();
            if (rs.next()) {
                listarPorCidade = new ArrayList<>();
                do {
                    Diario diario = new Diario();
                    diario.setCodDiario(rs.getLong("cod_diario"));
                    Usuario usuario = UsuarioDAO.consultarUsuarioPorId(rs.getLong("cod_usuario"));
                    diario.setUsuario(usuario);
                    diario.setNomDiario(rs.getString("nom_diario"));
                    diario.setDatPublicacao(rs.getDate("dat_publicacao"));
                    diario.setDatInicioViagem(rs.getDate("dat_inicio_viagem"));
                    diario.setDatFimViagem(rs.getDate("dat_fim_viagem"));
                    diario.setTxtDiario(rs.getString("txt_diario"));

                    listarPorCidade.add(diario);
                } while (rs.next());

            }

            rs.close();
            pstmt.close();
            connection.close();

            return listarPorCidade;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new ExcessaoPersistencia(e);
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public List<Diario> listarPorEstado(Estado estado) {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT A.* FROM diario A "
                    + "JOIN dia B ON A.cod_diario = B.cod_diario "
                    + "JOIN dia_atracao C ON B.seq_dia = C.seq_dia "
                    + "JOIN atracao D ON C.seq_atracao = D.seq_atracao "
                    + "JOIN cidade E ON D.cod_cidade_atracao = E.cod_cidade "
                    + "JOIN estado F ON E.cod_estado = F.cod_estado "
                    + "WHERE E.cod_estado = ? "
                    + "GROUP BY 1;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, estado.getCodEstado());
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Diario> listarPorEstado = null;
            InterfaceUsuarioDAO UsuarioDAO = new UsuarioDAO();
            if (rs.next()) {
                listarPorEstado = new ArrayList<>();
                do {
                    Diario diario = new Diario();
                    diario.setCodDiario(rs.getLong("cod_diario"));
                    Usuario usuario = UsuarioDAO.consultarUsuarioPorId(rs.getLong("cod_usuario"));
                    diario.setUsuario(usuario);
                    diario.setNomDiario(rs.getString("nom_diario"));
                    diario.setDatPublicacao(rs.getDate("dat_publicacao"));
                    diario.setDatInicioViagem(rs.getDate("dat_inicio_viagem"));
                    diario.setDatFimViagem(rs.getDate("dat_fim_viagem"));
                    diario.setTxtDiario(rs.getString("txt_diario"));

                    listarPorEstado.add(diario);
                } while (rs.next());

            }

            rs.close();
            pstmt.close();
            connection.close();

            return listarPorEstado;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw new ExcessaoPersistencia(e);
            } catch (ExcessaoPersistencia ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
