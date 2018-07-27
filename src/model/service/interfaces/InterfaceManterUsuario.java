<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;

import java.util.List;
import model.domain.Usuario;
import util.db.exception.ExcecaoNegocio;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterUsuario {
    public Long cadastrar(Usuario usuario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean alterar(Usuario usuario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public boolean excluir(Usuario usuario) throws ExcecaoPersistencia, ExcecaoNegocio;
    public Usuario pesquisarPorId(Long codUsuario) throws ExcecaoPersistencia;
    public Usuario pesquisarPorEmail(String txtEmail) throws ExcecaoPersistencia;
    public List<Usuario> pesquisarTodos() throws ExcecaoPersistencia;
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;


import java.util.List;
import model.domain.Usuario;
import util.db.exception.*;

/**
 *
 * @author User
 */
public interface InterfaceManterUsuario {
    public Long cadastrar(Usuario usuario) throws  ExcecaoPersistencia,ExcecaoNegocio; 
    public boolean alterar(Usuario usuario) throws ExcecaoPersistencia,ExcecaoNegocio;
    public boolean excluir(Usuario usuario) throws ExcecaoPersistencia,ExcecaoNegocio;
    public List<Usuario> pesquisarTodos() throws ExcecaoPersistencia;
    public Usuario pesquisarPorId(Long id) throws ExcecaoPersistencia;
    public Usuario getUserLogin(String nome, String senha) throws ExcecaoPersistencia,ExcecaoNegocio;
}
>>>>>>> 19eae2760b25143367cc2c89742f1866ae5771f3
