/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.TagDiario;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterTagDiario {
    public Long cadastrar(TagDiario tagDiario ) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(TagDiario tagDiario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(TagDiario tagDiario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public TagDiario pesquisarPorId(Long seqTagDiario) throws ExcecaoPersistencia;
    public List<TagDiario> pesquisarTodos() throws ExcecaoPersistencia;
    public List<TagDiario> pesquisarPorCodDiario(Long codDiario) throws ExcecaoPersistencia;
    public List<TagDiario> pesquisarPorCodTag(Long codTag) throws ExcecaoPersistencia;
}
