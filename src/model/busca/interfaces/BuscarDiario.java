/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.busca.interfaces;

import java.util.List;
import model.domain.Diario;
import util.db.exception.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface BuscarDiario extends InterfaceBusca {
    //O metodo abaixo chama os outros dois metodos abaixo dele
    @Override
    public List<Diario> buscaGeral(String busca) throws ExcecaoPersistencia;
    
    //Compara a String com o nome do Diario
    public List<Diario> compararNomDiario(String busca) throws ExcecaoPersistencia;
    
    //Compara a String com o nome da atracao que esta ligada ao diario
    public List<Diario> compararNomAtracaoRelacionada(String busca) throws ExcecaoPersistencia;
    
    //Compara a String com o nome da cidade que esta ligada ao diario
    public List<Diario> compararNomCidadeRelacionada(String busca) throws ExcecaoPersistencia;
    
    //Compara a String com o texto do diario
    public List<Diario> compararTextoDiario(String busca) throws ExcecaoPersistencia;
    
}
