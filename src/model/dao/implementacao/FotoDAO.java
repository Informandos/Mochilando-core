package model.dao.implementacao;


import java.util.List;
import model.dao.interfaces.InterfaceFotoDAO;
import model.domain.Foto;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.domain.Dia;
import model.excecao.ExcecaoPersistencia;
import util.db.ConnectionFactory;
import util.db.ConnectionManager;
import model.dao.implementacao.DiaDAO;
import model.dao.interfaces.InterfaceDiaDAO;



public class FotoDAO implements InterfaceFotoDAO {

    
    @Override
    public Long inserir(Foto foto) throws ExcecaoPersistencia {

        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO usuario (seq_foto,seq_dia,foto) VALUES(?,?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            pstmt.setLong(1,foto.getSeqFoto());
            pstmt.setLong(2,foto.getDia().getSeqDia());
            pstmt.setBlob(3,foto.getByteFoto());
            
            ResultSet rs = pstmt.executeQuery();

            Long id = null;
            if (rs.next()) {
                id = new Long(rs.getLong("seq_foto"));
                foto.setSeqFoto(id);
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
    public boolean alterar(Foto foto) throws ExcecaoPersistencia {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE usuario "
                    + "   SET seq_foto = ?, "
                    + "       seq_dia = ?, "
                    + "       foto = ? "    
                    + " WHERE seq_foto = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            Long seqFoto = foto.getSeqFoto();
            pstmt.setLong(1,foto.getSeqFoto());
            pstmt.setLong(2,foto.getDia().getSeqDia());
            pstmt.setBlob(3,foto.getByteFoto());

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
    public boolean excluir(Foto foto) throws ExcecaoPersistencia {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM usuario WHERE seq_foto = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1,foto.getSeqFoto());
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
    public ArrayList<Foto> listarTudo() throws ExcecaoPersistencia {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM foto ORDER BY seq_foto";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            ArrayList<Foto> listAll = null;
            InterfaceDiaDAO diaDAO = new DiaDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Foto foto = new Foto();
                    foto.setSeqFoto(rs.getLong("seq_foto"));
                    Dia dia = diaDAO.consultarDiaPorId(rs.getLong("seq_dia"));
                    foto.setDia(dia);
                    foto.setByteFoto(rs.getBlob("foto"));
                    
                    listAll.add(foto);
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
    public Foto obterFotoPorId(Long seqFoto) throws ExcecaoPersistencia {

        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE seq_foto = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seqFoto);
            ResultSet rs = pstmt.executeQuery();

            Foto usuario = null;
             InterfaceDiaDAO diaDAO = new DiaDAO();
            if (rs.next()) {
                
                    Foto foto = new Foto();
                    foto.setSeqFoto(rs.getLong("seq_foto"));
                    Dia dia = diaDAO.consultarDiaPorId(rs.getLong("seq_dia"));
                    foto.setDia(dia);
                    foto.setByteFoto(rs.getBlob("foto"));
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
    public List<Foto> listarPorDia(Long seqDia) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
