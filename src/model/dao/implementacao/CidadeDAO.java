/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implementacao;

import java.util.List;
import model.dao.interfaces.InterfaceCidadeDAO;
import model.domain.Cidade;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana, Carlos
 */
public class CidadeDAO implements InterfaceCidadeDAO {

    @Override
    public Long inserir(Cidade cidade) throws ExcecaoPersistencia {
        if (cidade == null) {

            throw new ExcecaoPersistencia("Cidade nao pode ser null");

        }

        Long codCidade = null;

        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO cidade (cod_estado, nom_cidade) "
                    + "VALUES(?,?) RETURNING cod_cidade";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setString(1, cidade.getEstado());
            pstmt.setString(2, cidade.getNomCidade());

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                codCidade = rs.getLong("cod_cidade");
            }

            rs.close();
            pstmt.close();
            connection.close();
            return codCidade;

        } catch (ClassNotFoundException | SQLException e) {

            throw new ExcecaoPersistencia(e.getMessage(), e);    
    }

    @Override
    public boolean atualizar(Cidade cidade) throws ExcecaoPersistencia {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE cidade "
                    + "   SET cod_estado = ?, "
                    + "       nom_cidade = ?, "
                    + " WHERE cod_diario = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            ppstmt.setString(1, cidade.getEstado());
            pstmt.setString(2, cidade.getNomCidade());

            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

            return true;

        } catch (ClassNotFoundException | SQLException e) {

            throw new ExcecaoPersistencia(e.getMessage(), e);

        }    
    }

    @Override
    public boolean deletar(Cidade cidade) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cidade consultarPorId(Long codCidade) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cidade> listarPorCodEstado(Long codEstado) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cidade> listarTudo() throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
