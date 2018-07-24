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
    
    private Long seqAvaliacao;
    private Long seqComentario;
    private Long codUsuarioAvaliador;
    private String avaliacao; //limitar em dois valores

    public AvaliacaoComentario() {
    }

    public AvaliacaoComentario(Long seqAvaliacao, Long seqComentario, Long codUsuarioAvaliador, String avaliacao) {
        this.seqAvaliacao = seqAvaliacao;
        this.seqComentario = seqComentario;
        this.codUsuarioAvaliador = codUsuarioAvaliador;
        this.avaliacao = avaliacao;
    }

    /**
     * @return the seqComentario
     */
    public Long getSeqComentario() {
        return seqComentario;
    }

    /**
     * @param seqComentario the seqComentario to set
     */
    public void setSeqComentario(Long seqComentario) {
        this.seqComentario = seqComentario;
    }

    /**
     * @return the codUsuarioAvaliador
     */
    public Long getCodUsuarioAvaliador() {
        return codUsuarioAvaliador;
    }

    /**
     * @param codUsuarioAvaliador the codUsuarioAvaliador to set
     */
    public void setCodUsuarioAvaliador(Long codUsuarioAvaliador) {
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
    public Long getSeqAvaliacao() {
        return seqAvaliacao;
    }

    /**
     * @param seqAvaliacao the seqAvaliacao to set
     */
    public void setSeqAvaliacao(Long seqAvaliacao) {
        this.seqAvaliacao = seqAvaliacao;
    }
    
    
}
