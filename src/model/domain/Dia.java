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
    private String codDiario;
    private String seqDiaDiario;
    private String txtDia;

    public Dia() {
    }

    public Dia(String codDiario, String seqDiaDiario, String txtDia) {
        this.codDiario = codDiario;
        this.seqDiaDiario = seqDiaDiario;
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
     * @return the seqDiaDiario
     */
    public String getSeqDiaDiario() {
        return seqDiaDiario;
    }

    /**
     * @param seqDiaDiario the seqDiaDiario to set
     */
    public void setSeqDiaDiario(String seqDiaDiario) {
        this.seqDiaDiario = seqDiaDiario;
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
