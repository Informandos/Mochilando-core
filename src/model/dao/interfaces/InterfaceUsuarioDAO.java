/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Usuario;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceUsuarioDAO {
    public Long inserir(Usuario usuario) throws ExcecaoPersistencia;
    public boolean atualizar(Usuario usuario) throws ExcecaoPersistencia;
    public boolean deletar(Usuario usuario) throws ExcecaoPersistencia;
    public Usuario consultarUsuarioPorId(Long codUsuario) throws ExcecaoPersistencia;
    public Usuario consultarUsuarioPorEmail(String txtEmail) throws ExcecaoPersistencia;
    public List<Usuario> listarTudo() throws ExcecaoPersistencia;
}
