/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.Estado;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterEstado {
    public Long cadastrar(Estado estado) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(Estado estado) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(Estado estado) throws ExcecaoPersistencia, ExcecaoNegocio;
    public Estado pesquisarPorId(Long codEstado) throws ExcecaoPersistencia;
    public Estado pesquisarPorSigla(String sigla) throws ExcecaoPersistencia;
    public List<Estado> pesquisarTodos() throws ExcecaoPersistencia;
}
