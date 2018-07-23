/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.excecao;

/**
 *
 * @author Juliana
 */
public class ExcessaoPersistencia extends Exception {
    public ExcessaoPersistencia(String mensagem){
        super(mensagem);
    }
}
