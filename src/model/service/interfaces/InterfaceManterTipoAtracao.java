/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.TipoAtracao;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterTipoAtracao {
    public Long cadastrar(TipoAtracao tipoAtracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(TipoAtracao tipoAtracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(TipoAtracao tipoAtracao) throws ExcecaoPersistencia, ExcecaoNegocio;
    public TipoAtracao pesquisarPorId(Long codTipoAtracao) throws ExcecaoPersistencia;
    public TipoAtracao pesquisarPorNome(String descTipoAtracao) throws ExcecaoPersistencia;
    public List<TipoAtracao> pesquisarTodos() throws ExcecaoPersistencia;
}
