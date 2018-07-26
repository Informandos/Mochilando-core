/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.busca.interfaces;

import java.util.List;
import model.domain.Atracao;

/**
 *
 * @author Juliana
 */
public interface BuscarAtracao extends InterfaceBusca {
    @Override
    public List<Atracao> BuscaGeral(String busca);
    //O metodo acima chama os dois metodos abaixo
    
    //O metodo abaixo compara a String com o nome da atracao
    public List<Atracao> CompararNomAtracao(String busca);
    
    //O metodo abaixo compara a String com a cidade da atracao
    public List<Atracao> CompararCidadeAtracao(String busca);
}
