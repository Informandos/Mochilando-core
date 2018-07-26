/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implementacao;

import java.util.List;
import model.dao.interfaces.InterfaceDiaDAO;
import model.domain.Dia;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public class DiaDAO implements InterfaceDiaDAO {

    @Override
    public Long inserir(Dia dia)  throws ExcessaoPersistencia{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(Dia dia)  throws ExcessaoPersistencia{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Dia dia) throws ExcessaoPersistencia{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dia consultarDiaPorId(Long seqDia)  throws ExcessaoPersistencia{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Dia> listarPorDiario(Long seqDiario)  throws ExcessaoPersistencia{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
