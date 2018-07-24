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
public class DiaAtracao {
    private Long seqDiaAtracao;
    private Long seqAtracao;
    private Long seqDia;

    public DiaAtracao() {
    }

    public DiaAtracao(Long seqDiaAtracao, Long seqAtracao, Long seqDia) {
        this.seqDiaAtracao = seqDiaAtracao;
        this.seqAtracao = seqAtracao;
        this.seqDia = seqDia;
    }

    /**
     * @return the seqDiaAtracao
     */
    public Long getSeqDiaAtracao() {
        return seqDiaAtracao;
    }

    /**
     * @param seqDiaAtracao the seqDiaAtracao to set
     */
    public void setSeqDiaAtracao(Long seqDiaAtracao) {
        this.seqDiaAtracao = seqDiaAtracao;
    }

    /**
     * @return the seqAtracao
     */
    public Long getSeqAtracao() {
        return seqAtracao;
    }

    /**
     * @param seqAtracao the seqAtracao to set
     */
    public void setSeqAtracao(Long seqAtracao) {
        this.seqAtracao = seqAtracao;
    }

    /**
     * @return the seqDia
     */
    public Long getSeqDia() {
        return seqDia;
    }

    /**
     * @param seqDia the seqDia to set
     */
    public void setSeqDia(Long seqDia) {
        this.seqDia = seqDia;
    }
}
