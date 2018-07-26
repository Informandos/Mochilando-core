/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Tag;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceTagDAO {
    public Long inserir(Tag preferencia) throws ExcecaoPersistencia;
    public boolean alterar(Tag preferencia) throws ExcecaoPersistencia;
    public boolean excluir(Tag preferencia) throws ExcecaoPersistencia;
    public Tag consultarPreferenciaPorId(Long codPreferencia) throws ExcecaoPersistencia;
    public Tag consultarPreferenciaPorNome(String descPreferencia) throws ExcecaoPersistencia;
    public List<Tag> listarTudo() throws ExcecaoPersistencia;
}
