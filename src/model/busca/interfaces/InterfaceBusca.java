/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.busca.interfaces;

import java.util.List;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 * @param <ObjetoGenerico>
 */
public interface InterfaceBusca<ObjetoGenerico> {
    public List<ObjetoGenerico> BuscaGeral(String busca) throws ExcecaoPersistencia;
    /*Esta interface tem o proposito de retornar todos os objetos que tem algum atributo String que corresponda a string buscada*/
}
