/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.busca.interfaces;

import java.util.List;
import model.domain.Usuario;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface BuscarUsuario extends InterfaceBusca{
    @Override
    public List<Usuario> buscaGeral(String busca) throws ExcecaoPersistencia;
    
    //Compara a String com o nome do Usuario
    public List<Usuario> compararNomUsuario(String busca) throws ExcecaoPersistencia;
}
