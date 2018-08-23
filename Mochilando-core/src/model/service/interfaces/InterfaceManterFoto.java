/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.Foto;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterFoto {
    public Long cadastrar(Foto foto) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(Foto foto) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(Foto foto) throws ExcecaoPersistencia, ExcecaoNegocio;
    public Foto pesquisarPorId(Long seqFoto) throws ExcecaoPersistencia;
    public List<Foto> pesquisarTodos() throws ExcecaoPersistencia;
    public List<Foto> pesquisarPorDia(Long seqDia) throws ExcecaoPersistencia;
}
