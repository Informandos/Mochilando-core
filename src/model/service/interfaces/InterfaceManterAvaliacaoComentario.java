/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.AvaliacaoComentario;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterAvaliacaoComentario {

    
    public Long cadastrar(AvaliacaoComentario avaliacaoComentario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(AvaliacaoComentario avaliacaoComentario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(AvaliacaoComentario avaliacaoComentario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public AvaliacaoComentario pesquisarPorId(Long seqAvaliacao) throws ExcecaoPersistencia;
    public int pesquisarNumAvPositivas(Long seqComentario) throws ExcecaoPersistencia;
    public int pesquisarNumAvNegativas(Long seqComentario) throws ExcecaoPersistencia;
    public List <AvaliacaoComentario> pesquisarPorDiario(Long codDiario) throws ExcecaoPersistencia;
    public List <AvaliacaoComentario> pesquisarTodos(Long seqAvaliacao) throws ExcecaoPersistencia;
        

}
