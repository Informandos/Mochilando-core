
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
    public Usuario getUserLogin(String email, String senha) throws ExcecaoPersistencia,ExcecaoNegocio;
     public Usuario getUserEmail(String email) throws ExcecaoPersistencia,ExcecaoNegocio;
}