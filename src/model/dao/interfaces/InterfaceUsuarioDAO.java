/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Usuario;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceUsuarioDAO {
    public Long inserir(Usuario usuario) throws ExcessaoPersistencia;
    public boolean alterar(Usuario usuario) throws ExcessaoPersistencia;
    public boolean excluir(Usuario usuario) throws ExcessaoPersistencia;
    public Usuario consultarUsuarioPorId(Long codUsuario) throws ExcessaoPersistencia;
    public Usuario consultarUsuarioPorEmail(String txtEmail) throws ExcessaoPersistencia;
    public List<Usuario> listarTudo() throws ExcessaoPersistencia;
}
