/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.Tag;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterTag {
    public Long cadastrar(Tag tag) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(Tag tag) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(Tag tag) throws ExcecaoPersistencia, ExcecaoNegocio;
    public Tag pesquisarPorId(Long codTag) throws ExcecaoPersistencia;
    public Tag pesquisarPorNome(String descTag) throws ExcecaoPersistencia;
    public List<Tag> pesquisarTodos() throws ExcecaoPersistencia;
}
