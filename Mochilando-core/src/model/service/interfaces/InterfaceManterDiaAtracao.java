/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.DiaAtracao;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterDiaAtracao {
    public Long cadastrar(DiaAtracao diaAtracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(DiaAtracao diaAtracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(DiaAtracao diaAtracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public DiaAtracao pesquisarPorId(Long seqDiaAtracao) throws ExcecaoPersistencia;
    public List<DiaAtracao> pesquisarPorSeqDia(Long seqDia) throws ExcecaoPersistencia;
    public List<DiaAtracao> pesquisarTodos() throws ExcecaoPersistencia;
}
