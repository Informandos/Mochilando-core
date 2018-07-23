/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

/**
 *
 * @author Juliana
 */
public class AvaliacaoComentario {
    
    private String codComentario;
    private String codUsuarioAvaliador;
    private String avaliacao; //limitar em dois valores

    public AvaliacaoComentario() {
    }

    public AvaliacaoComentario(String codComentario, String codUsuarioAvaliador, String avaliacao) {
        this.codComentario = codComentario;
        this.codUsuarioAvaliador = codUsuarioAvaliador;
        this.avaliacao = avaliacao;
    }

    /**
     * @return the codComentario
     */
    public String getCodComentario() {
        return codComentario;
    }

    /**
     * @param codComentario the codComentario to set
     */
    public void setCodComentario(String codComentario) {
        this.codComentario = codComentario;
    }

    /**
     * @return the codUsuarioAvaliador
     */
    public String getCodUsuarioAvaliador() {
        return codUsuarioAvaliador;
    }

    /**
     * @param codUsuarioAvaliador the codUsuarioAvaliador to set
     */
    public void setCodUsuarioAvaliador(String codUsuarioAvaliador) {
        this.codUsuarioAvaliador = codUsuarioAvaliador;
    }

    /**
     * @return the avaliacao
     */
    public String getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliacao the avaliacao to set
     */
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}
