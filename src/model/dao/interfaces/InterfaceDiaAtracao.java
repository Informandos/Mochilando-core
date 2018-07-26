/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.DiaAtracao;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */

public interface InterfaceDiaAtracao {
    public Long inserir(DiaAtracao diaAtracao) throws ExcessaoPersistencia;
    public boolean alterar(DiaAtracao diaAtracao) throws ExcessaoPersistencia;
    public boolean excluir(DiaAtracao diaAtracao) throws ExcessaoPersistencia;
    public DiaAtracao consultarPorId(Long seqDiaAtracao) throws ExcessaoPersistencia;
    public List<DiaAtracao> listarTudo() throws ExcessaoPersistencia;
    public List<DiaAtracao> listarPorDia(Long seqDia) throws ExcessaoPersistencia;
}
