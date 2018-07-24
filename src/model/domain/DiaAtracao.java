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
    private String seqDiaAtracao;
    private String seqAtracao;
    private String seqDia;

    public DiaAtracao() {
    }

    public DiaAtracao(String seqDiaAtracao, String seqAtracao, String seqDia) {
        this.seqDiaAtracao = seqDiaAtracao;
        this.seqAtracao = seqAtracao;
        this.seqDia = seqDia;
    }

    /**
     * @return the seqAtracao
     */
    public String getSeqAtracao() {
        return seqAtracao;
    }

    /**
     * @param seqAtracao the seqAtracao to set
     */
    public void setSeqAtracao(String seqAtracao) {
        this.seqAtracao = seqAtracao;
    }

    /**
     * @return the seqDia
     */
    public String getSeqDia() {
        return seqDia;
    }

    /**
     * @param seqDia the seqDia to set
     */
    public void setSeqDia(String seqDia) {
        this.seqDia = seqDia;
    }

    /**
     * @return the seqDiaAtracao
     */
    public String getSeqDiaAtracao() {
        return seqDiaAtracao;
    }

    /**
     * @param seqDiaAtracao the seqDiaAtracao to set
     */
    public void setSeqDiaAtracao(String seqDiaAtracao) {
        this.seqDiaAtracao = seqDiaAtracao;
    }
    
    
}
