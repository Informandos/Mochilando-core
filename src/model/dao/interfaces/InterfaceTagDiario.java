/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.TagDiario;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceTagDiario {
    public Long inserir(TagDiario tagDiario ) throws ExcessaoPersistencia;
    public boolean alterar(TagDiario tagDiario) throws ExcessaoPersistencia;
    public boolean excluir(TagDiario tagDiario) throws ExcessaoPersistencia;
    public TagDiario consultarPorId(Long seqTagDiario) throws ExcessaoPersistencia;
    public List<TagDiario> listarTudo() throws ExcessaoPersistencia;
    public List<TagDiario> listarPorDiario(Long codDiario) throws ExcessaoPersistencia;
}
