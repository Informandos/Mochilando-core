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
    
    private String seqAvaliacao;
    private String seqComentario;
    private String codUsuarioAvaliador;
    private String avaliacao; //limitar em dois valores

    public AvaliacaoComentario() {
    }

    public AvaliacaoComentario(String seqAvaliacao, String seqComentario, String codUsuarioAvaliador, String avaliacao) {
        this.seqAvaliacao = seqAvaliacao;
        this.seqComentario = seqComentario;
        this.codUsuarioAvaliador = codUsuarioAvaliador;
        this.avaliacao = avaliacao;
    }

    /**
     * @return the seqComentario
     */
    public String getSeqComentario() {
        return seqComentario;
    }

    /**
     * @param seqComentario the seqComentario to set
     */
    public void setSeqComentario(String seqComentario) {
        this.seqComentario = seqComentario;
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

    /**
     * @return the seqAvaliacao
     */
    public String getSeqAvaliacao() {
        return seqAvaliacao;
    }

    /**
     * @param seqAvaliacao the seqAvaliacao to set
     */
    public void setSeqAvaliacao(String seqAvaliacao) {
        this.seqAvaliacao = seqAvaliacao;
    }
    
    
}
