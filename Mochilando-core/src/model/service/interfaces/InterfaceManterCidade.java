/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.Cidade;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterCidade {
    public Long cadastrar(Cidade cidade) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(Cidade cidade) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(Cidade cidade) throws ExcecaoPersistencia, ExcecaoNegocio;
    public Cidade pesquisarPorId(Long codCidade) throws ExcecaoPersistencia;
    public List<Cidade> pesquisarPorCodEstado(Long codEstado) throws ExcecaoPersistencia;
    public List<Cidade> pesquisarTodos() throws ExcecaoPersistencia;
}
