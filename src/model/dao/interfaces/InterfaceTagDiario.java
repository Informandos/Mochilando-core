/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.TagDiario;

/**
 *
 * @author Juliana
 */
public interface InterfaceTagDiario {
    public Long inserir(TagDiario tagDiario );
    public boolean alterar(TagDiario tagDiario);
    public boolean excluir(TagDiario tagDiario);
    public TagDiario consultarPorId(Long seqTagDiario);
    public List<TagDiario> listarTudo();
    public List<TagDiario> listarPorDiario(Long codDiario);
}
