/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;


import util.db.exception.ExcecaoPersistencia;
import java.util.List;
import model.domain.Atracao;
import util.db.exception.ExcecaoNegocio;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterAtracao {
    
    public Long cadastrar(Atracao atracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(Atracao atracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(Atracao atracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public Atracao pesquisarPorId(Long id) throws ExcecaoPersistencia;
    public List<Atracao> pesquisarPorCodCidade(Long codCidade) throws ExcecaoPersistencia;
    public List<Atracao> pesquisarPorCodEstado(Long codEstado) throws ExcecaoPersistencia;
    public List<Atracao> pesquisarPorCodTipoAtracao(Long codTipoAtracao) throws ExcecaoPersistencia;   
    public List<Atracao> pesquisarTodos() throws ExcecaoPersistencia;
    
}
