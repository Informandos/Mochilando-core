/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Usuario;

/**
 *
 * @author Juliana
 */
public interface InterfaceUsuarioDAO {
    public Long inserir(Usuario usuario);
    public boolean alterar(Usuario usuario);
    public boolean excluir(Usuario usuario);
    public Usuario consultarUsuarioPorId(Long codUsuario);
    public Usuario consultarUsuarioPorEmail(String txtEmail);
    public List<Usuario> listarTudo();
}
