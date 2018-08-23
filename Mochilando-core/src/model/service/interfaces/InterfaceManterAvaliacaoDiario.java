/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.AvaliacaoDiario;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterAvaliacaoDiario {
    
    public Long cadastrar(AvaliacaoDiario avaliacaoDiario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(AvaliacaoDiario avaliacaoDiario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(AvaliacaoDiario avaliacaoDiario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public AvaliacaoDiario pesquisarPorId(Long seqAvaliacao) throws ExcecaoPersistencia;
    public int pesquisarNumAvPositivas(Long codDiario) throws ExcecaoPersistencia;
    public int pesquisarNumAvNegativas(Long codDiario) throws ExcecaoPersistencia;
    public List<AvaliacaoDiario> pesquisarPorDiario(Long codDiario) throws ExcecaoPersistencia;
    public List<AvaliacaoDiario> pesquisarTodos() throws ExcecaoPersistencia;
}
