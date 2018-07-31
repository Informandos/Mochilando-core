/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.busca.interfaces;

import java.util.List;
import model.domain.Atracao;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface BuscarAtracao extends InterfaceBusca {
    @Override
    public List<Atracao> buscaGeral(String busca) throws ExcecaoPersistencia;
    //O metodo acima chama os dois metodos abaixo
    
    //O metodo abaixo compara a String com o nome da atracao
    public List<Atracao> compararNomAtracao(String busca) throws ExcecaoPersistencia;
    
    //O metodo abaixo compara a String com a cidade da atracao
    public List<Atracao> compararCidadeAtracao(String busca) throws ExcecaoPersistencia;
}
