/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.UsuarioPreferencia;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceUsuarioPreferencia {
    public Long inserir(UsuarioPreferencia usuarioPreferencia) throws ExcecaoPersistencia;
    public boolean alterar(UsuarioPreferencia usuarioPreferencia) throws ExcecaoPersistencia;
    public boolean excluir(UsuarioPreferencia usuarioPreferencia) throws ExcecaoPersistencia;
    public UsuarioPreferencia consultarPorId(Long seqUsuarioPreferencia) throws ExcecaoPersistencia;
    public List<UsuarioPreferencia> listarTudo() throws ExcecaoPersistencia;
    public List<UsuarioPreferencia> listarPorCodUsuario(Long codUsuario) throws ExcecaoPersistencia;
}
