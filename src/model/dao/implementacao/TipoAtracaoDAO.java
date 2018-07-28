/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implementacao;

import java.util.List;
import model.dao.interfaces.InterfaceTipoAtracaoDAO;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public class TipoAtracaoDAO implements InterfaceTipoAtracaoDAO {

    @Override
    public Long inserir(model.domain.TipoAtracao tipoAtracao) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(model.domain.TipoAtracao tipoAtracao) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar(model.domain.TipoAtracao tipoAtracao) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public model.domain.TipoAtracao consultarPorId(Long codTipoAtracao) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public model.domain.TipoAtracao consultarPorNome(String descTipoAtracao) throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model.domain.TipoAtracao> listarTudo() throws ExcecaoPersistencia {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
