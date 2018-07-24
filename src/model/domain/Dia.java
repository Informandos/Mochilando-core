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
    
    private String seqDia;
    private String codDiario;
    private String txtDia;

    public Dia() {
    }

    public Dia(String seqDia, String codDiario, String txtDia) {
        this.codDiario = codDiario;
        this.seqDia = seqDia;
        this.txtDia = txtDia;
    }

    /**
     * @return the codDiario
     */
    public String getCodDiario() {
        return codDiario;
    }

    /**
     * @param codDiario the codDiario to set
     */
    public void setCodDiario(String codDiario) {
        this.codDiario = codDiario;
    }

    /**
     * @return the seqDia
     */
    public String getSeqDiaDiario() {
        return seqDia;
    }

    /**
     * @param seqDia the seqDia to set
     */
    public void setSeqDiaDiario(String seqDia) {
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
