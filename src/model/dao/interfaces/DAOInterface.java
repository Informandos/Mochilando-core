/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 * @param <ObjetoGenerico>
 */
public interface DAOInterface <ObjetoGenerico> {
    
    /**
     *
     * @param objetoGenerico
     * @return
     * @throws ExcecaoPersistencia
     */
    public Long inserir(ObjetoGenerico objetoGenerico) throws ExcecaoPersistencia;
    public boolean alterar(ObjetoGenerico objetoGenerico) throws ExcecaoPersistencia;
    public boolean excluir(ObjetoGenerico objetoGenerico) throws ExcecaoPersistencia;
    public ObjetoGenerico consultarPorId(Long idGenerico) throws ExcecaoPersistencia;
    public List<ObjetoGenerico> listarTudo() throws ExcecaoPersistencia;
}
