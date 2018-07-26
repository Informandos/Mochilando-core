/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.UsuarioTag;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceUsuarioTag {
    public Long inserir(UsuarioTag usuarioPreferencia) throws ExcecaoPersistencia;
    public boolean alterar(UsuarioTag usuarioPreferencia) throws ExcecaoPersistencia;
    public boolean excluir(UsuarioTag usuarioPreferencia) throws ExcecaoPersistencia;
    public UsuarioTag consultarPorId(Long seqUsuarioPreferencia) throws ExcecaoPersistencia;
    public List<UsuarioTag> listarTudo() throws ExcecaoPersistencia;
    public List<UsuarioTag> listarPorCodUsuario(Long codUsuario) throws ExcecaoPersistencia;
}
