/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.interfaces;


import util.db.exception.ExcecaoPersistencia;
import java.util.List;

/**
 *
 * @author Juliana
 */
public interface InterfaceManterAtracao {
        public Long cadastrar(Categoria categoria) throws PersistenciaException, NegocioException;
    public boolean alterar(Categoria categoria) throws PersistenciaException, NegocioException;
    public boolean excluir(Categoria categoria) throws PersistenciaException, NegocioException;
    public List<Categoria> pesquisarTodos() throws PersistenciaException;
    public Categoria pesquisarPorId(Long id) throws PersistenciaException;
    
}
