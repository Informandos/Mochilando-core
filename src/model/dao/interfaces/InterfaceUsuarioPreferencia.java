/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.UsuarioPreferencia;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceUsuarioPreferencia {
    public Long inserir(UsuarioPreferencia usuarioPreferencia) throws ExcessaoPersistencia;
    public boolean alterar(UsuarioPreferencia usuarioPreferencia) throws ExcessaoPersistencia;
    public boolean excluir(UsuarioPreferencia usuarioPreferencia) throws ExcessaoPersistencia;
    public UsuarioPreferencia consultarPorId(Long seqUsuarioPreferencia) throws ExcessaoPersistencia;
    public List<UsuarioPreferencia> listarTudo() throws ExcessaoPersistencia;
    public List<UsuarioPreferencia> listarPorUsuario(Long codUsuario) throws ExcessaoPersistencia;
}
