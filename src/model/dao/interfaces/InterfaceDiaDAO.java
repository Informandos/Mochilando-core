/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Dia;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceDiaDAO {
    public Long inserir(Dia dia) throws ExcessaoPersistencia;
    public boolean alterar(Dia dia) throws ExcessaoPersistencia;
    public boolean excluir(Dia dia) throws ExcessaoPersistencia;
    public Dia consultarDiaPorId(Long seqDia) throws ExcessaoPersistencia;
    public List<Dia> listarPorCodDiario(Long codDiario) throws ExcessaoPersistencia; 
}
