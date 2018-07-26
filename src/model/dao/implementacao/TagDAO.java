/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implementacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.dao.interfaces.InterfaceTagDAO;
import model.domain.Tag;
import model.excecao.ExcecaoPersistencia;
import util.db.ConnectionManager;

/**
 *
 * @author User
 */
public class TagDAO implements InterfaceTagDAO {

    @Override
    public Long inserir(Tag tag) throws ExcecaoPersistencia {
         try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO tag (cod_tag,desc_tag) VALUES(?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            pstmt.setLong(1,tag.getCodPreferencia());
            pstmt.setString(2,tag.getDescPreferencia());
           
            
            ResultSet rs = pstmt.executeQuery();

            Long id = null;
            if (rs.next()) {
                id = new Long(rs.getLong("cod_tag"));
                tag.setCodPreferencia(id);
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
    public boolean alterar(Tag tag) throws ExcecaoPersistencia {
        try{
         Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE tag "
                    + "   SET  cod_tag = ?, "
                    + "       desc_tag = ? "    
                    + " WHERE cod_tag = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            Long codTag = tag.getCodPreferencia();
           
            pstmt.setLong(1,tag.getCodPreferencia());
            pstmt.setString(2,tag.getDescPreferencia());

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
    public boolean excluir(Tag tag) throws ExcecaoPersistencia {
        try{
        Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM tag WHERE cod_tag = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1,tag.getCodPreferencia());
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
    public Tag consultarPreferenciaPorId(Long codTag) throws ExcecaoPersistencia {
       try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM tag WHERE cod_tag = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, codTag);
            ResultSet rs = pstmt.executeQuery();

            Tag tag = null;
             
            if (rs.next()) {
                
                    tag = new Tag();
                    tag.setCodPreferencia(rs.getLong("cod_tag"));
                   
                    tag.setDescPreferencia(rs.getString("desc_tag"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return tag;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }

    @Override
    public Tag consultarPreferenciaPorNome(String descTag) throws ExcecaoPersistencia {
           try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM tag WHERE desc_tag = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, descTag);
            ResultSet rs = pstmt.executeQuery();

            Tag tag = null;
             
            if (rs.next()) {
                
                    tag = new Tag();
                    tag.setCodPreferencia(rs.getLong("cod_tag"));
                   
                    tag.setDescPreferencia(rs.getString("desc_tag"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return tag;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage(), e);
        }
    }

    @Override
    public List<Tag> listarTudo() throws ExcecaoPersistencia {
        try{
         Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM tag ORDER BY cod_tag";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            ArrayList<Tag> listAll = null;
            
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Tag tag = new Tag();
                    tag.setCodPreferencia(rs.getLong("cod_tag"));
                    
                    tag.setDescPreferencia(rs.getString("desc_tag"));
                    
                    listAll.add(tag);
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
    
}
