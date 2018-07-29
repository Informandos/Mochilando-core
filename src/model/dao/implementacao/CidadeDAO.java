/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implementacao;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dao.interfaces.InterfaceCidadeDAO;
import model.domain.Cidade;
import util.db.exception.ExcecaoPersistencia;
import java.sql.Connection;
import util.db.ConnectionManager;

/**
 *
 * @author Juliana, Carlos
 */
public class CidadeDAO implements InterfaceCidadeDAO {

    @Override
    public Long inserir(Cidade cidade) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(Cidade cidade) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
