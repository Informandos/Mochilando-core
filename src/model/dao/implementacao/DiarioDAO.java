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

            String sql = "INSERT INTO Diario (cod_Usuario_Autor, nom_Diario, dat_Publicacao, dat_Inicio_Viagem, dat_Fim_Viagem, txt_Diario) "
                    + "VALUES(?,?,?,?,?,?) RETURNING cod_Diario";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setLong(1, diario.getUsuario().getCodUsuario());
            pstmt.setString(2, diario.getNomDiario());
            pstmt.setDate(3, new java.sql.Date(diario.getDatPublicacao().getTime()));
            pstmt.setDate(4, new java.sql.Date(diario.getDatInicioViagem().getTime()));
            pstmt.setDate(5, new java.sql.Date(diario.getDatFimViagem().getTime()));
            pstmt.setString(6, diario.getTxtDiario());

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                codDiario = rs.getLong("cod_Diario");
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

            String sql = "UPDATE Diario "
                    + "   SET cod_Usuario_Autor = ?, "
                    + "       nom_Diario = ?, "
                    + "       dat_Publicacao = ?, "
                    + "       dat_Inicio_Viagem = ?, "
                    + "       dat_Fim_Viagem = ?, "
                    + "       txt_Diario= ?, "
                    + " WHERE cod_Diario = ?;";

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

            String sql = "DELETE FROM Diario WHERE cod_diario = ?";

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

            String sql = "SELECT * FROM Diario WHERE cod_Diario = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, codDiario);
            ResultSet rs = pstmt.executeQuery();

            Diario diario = null;
            InterfaceUsuarioDAO usuarioDAO = new UsuarioDAO();
            if (rs.next()) {
                diario = new Diario();
                diario.setCodDiario(rs.getLong("cod_Diario"));
                Usuario usuario;
                usuario = usuarioDAO.consultarUsuarioPorId( rs.getLong("cod_Usuario") );
                diario.setUsuario(usuario);
                diario.setNomDiario(rs.getString("nom_Diario"));
                diario.setDatPublicacao(rs.getDate("dat_Publicacao"));
                diario.setDatInicioViagem(rs.getDate("dat_Inicio_Viagem"));
                diario.setDatFimViagem(rs.getDate("dat_Fim_Viagem"));
                diario.setTxtDiario(rs.getString("txt_Diario"));
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

            String sql = "SELECT * FROM Diario ORDER BY nom_diario";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Diario> listarTudo = null;
            UsuarioDAO UsuarioDAO = new UsuarioDAO();
            if (rs.next()) {
                listarTudo = new ArrayList<>();
                do {
                    Diario diario = new Diario();
                    diario.setCodDiario(rs.getLong("cod_Diario"));
                    Usuario usuario = UsuarioDAO.consultarUsuarioPorId(rs.getLong("cod_Usuario"));
                    diario.setUsuario(usuario);
                    diario.setNomDiario(rs.getString("nom_Diario"));
                    diario.setDatPublicacao(rs.getDate("dat_Publicacao"));
                    diario.setDatInicioViagem(rs.getDate("dat_Inicio_Viagem"));
                    diario.setDatFimViagem(rs.getDate("dat_Fim_Viagem"));
                    diario.setTxtDiario(rs.getString("txt_Diario"));
                    
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

            String sql = "SELECT * FROM Diario WHERE cod_Usuario_Autor = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, usuario.getCodUsuario());
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Diario> listarPorUsuario = null;
            if (rs.next()) {
                listarPorUsuario = new ArrayList<>();
                do {
                    Diario diario = new Diario();
                    diario.setCodDiario(rs.getLong("cod_Diario"));
                    diario.setUsuario(usuario);
                    diario.setNomDiario(rs.getString("nom_Diario"));
                    diario.setDatPublicacao(rs.getDate("dat_Publicacao"));
                    diario.setDatInicioViagem(rs.getDate("dat_Inicio_Viagem"));
                    diario.setDatFimViagem(rs.getDate("dat_Fim_Viagem"));
                    diario.setTxtDiario(rs.getString("txt_Diario"));
                    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Diario> listarPorEstado(Estado estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
