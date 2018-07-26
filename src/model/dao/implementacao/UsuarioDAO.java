/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implementacao;


import java.util.List;
import model.dao.interfaces.InterfaceUsuarioDAO;
import model.domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.excecao.ExcecaoPersistencia;
import util.db.ConnectionFactory;
import util.db.ConnectionManager;



public class UsuarioDAO implements InterfaceUsuarioDAO {

    
    @Override
    public Long inserir(Usuario usuario) throws ExcecaoPersistencia {

        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO usuario (cod_usuario,nom_usuario,sbrenome_usuario,txt_email,txt_senha,sexo,dat_nascimento) VALUES(?,?,?,?,md5(?),?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            Long codUsuario = usuario.getCodUsuario();
            pstmt.setString(1, Long.toString(codUsuario));
            pstmt.setString(2, usuario.getNomUsuario());
            pstmt.setString(3, usuario.getSobrenomeUsuario());
            pstmt.setString(4, usuario.getTxtEmail());
            pstmt.setString(5, usuario.getTxtSenha());
            pstmt.setString(6, usuario.getDatNascimento());
            
            ResultSet rs = pstmt.executeQuery();

            Long id = null;
            if (rs.next()) {
                id = new Long(rs.getLong("id"));
                usuario.setCodUsuario(id);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return id;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }

    @Override
    public boolean alterar(Usuario usuario) throws ExcecaoPersistencia {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE usuario "
                    + "   SET cod_nome = ?, "
                    + "       nom_usuario = ?, "
                    + "       sobrenome_usuario = ?, "
                    + "       txt_senha = md5(?), "
                    + "       sexo = ?, "
                    + "       dat_nascimento = ?"
                    + " WHERE id = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            Long codUsuario = usuario.getCodUsuario();
            pstmt.setString(1, Long.toString(codUsuario));
            pstmt.setString(2, usuario.getNomUsuario());
            pstmt.setString(3, usuario.getSobrenomeUsuario());
            pstmt.setString(4, usuario.getTxtEmail());
            pstmt.setString(5, usuario.getTxtSenha());
            pstmt.setString(6, usuario.getDatNascimento());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }

    @Override
    public boolean excluir(Usuario usuario) throws ExcecaoPersistencia {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM usuario WHERE id = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, usuario.getCodUsuario());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }

    @Override
    public ArrayList<Usuario> listarTudo() throws ExcecaoPersistencia {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario ORDER BY nomecompleto";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Usuario> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Usuario usuario = new Usuario();
                    usuario.setCodUsuario(rs.getLong("cod_usuario"));
                    usuario.setNomUsuario(rs.getString("nome_usuario"));
                    usuario.setSobrenomeUsuario(rs.getString("sobrenome_usuario"));
                    usuario.setTxtEmail(rs.getString("txt_email"));
                    usuario.setTxtSenha(rs.getString("txt_senha"));
                    usuario.setSexo(rs.getString("sexo"));
                    usuario.setDatNascimento(rs.getString("dat_nascimento"));
                    listAll.add(usuario);
                } while (rs.next());
            }

            rs.close();
            pstmt.close();
            connection.close();

            return listAll;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }

    @Override
    public Usuario consultarUsuarioPorId(Long id) throws ExcecaoPersistencia {

        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE id = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                 usuario.setCodUsuario(rs.getLong("cod_usuario"));
                    usuario.setNomUsuario(rs.getString("nome_usuario"));
                    usuario.setSobrenomeUsuario(rs.getString("sobrenome_usuario"));
                    usuario.setTxtEmail(rs.getString("txt_email"));
                    usuario.setTxtSenha(rs.getString("txt_senha"));
                    usuario.setSexo(rs.getString("sexo"));
                    usuario.setDatNascimento(rs.getString("dat_nascimento"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }

    

    @Override
    public Usuario consultarUsuarioPorEmail(String txtEmail) throws ExcecaoPersistencia {
         try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE txt_email = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, txtEmail);
            ResultSet rs = pstmt.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                 usuario.setCodUsuario(rs.getLong("cod_usuario"));
                    usuario.setNomUsuario(rs.getString("nome_usuario"));
                    usuario.setSobrenomeUsuario(rs.getString("sobrenome_usuario"));
                    usuario.setTxtEmail(rs.getString("txt_email"));
                    usuario.setTxtSenha(rs.getString("txt_senha"));
                    usuario.setSexo(rs.getString("sexo"));
                    usuario.setDatNascimento(rs.getString("dat_nascimento"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return usuario;
        }  catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }


}
