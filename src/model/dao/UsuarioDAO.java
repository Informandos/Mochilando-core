/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.domain.Usuario;

/**
 *
 * @author Juliana
 */
public interface UsuarioDAO {
    public Long insert(Usuario usuario);
    public boolean update(Usuario usuario);
    public boolean remove(String codUsuario);
    public Usuario getUserById(String codUsuario);
    public Usuario getUserByEmail(String txtEmail);
    public List<Usuario> listAll() ;
}
