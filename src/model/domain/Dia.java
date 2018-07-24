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
public class Dia {
    
    private Long seqDia;
    private Long codDiario;
    private String txtDia;

    public Dia() {
    }

    public Dia(Long seqDia, Long codDiario, String txtDia) {
        this.codDiario = codDiario;
        this.seqDia = seqDia;
        this.txtDia = txtDia;
    }

    /**
     * @return the codDiario
     */
    public Long getCodDiario() {
        return codDiario;
    }

    /**
     * @param codDiario the codDiario to set
     */
    public void setCodDiario(Long codDiario) {
        this.codDiario = codDiario;
    }

    /**
     * @return the seqDia
     */
    public Long getSeqDiaDiario() {
        return seqDia;
    }

    /**
     * @param seqDia the seqDia to set
     */
    public void setSeqDiaDiario(Long seqDia) {
        this.seqDia = seqDia;
    }

    /**
     * @return the txtDia
     */
    public String getTxtDia() {
        return txtDia;
    }

    /**
     * @param txtDia the txtDia to set
     */
    public void setTxtDia(String txtDia) {
        this.txtDia = txtDia;
    }
}
