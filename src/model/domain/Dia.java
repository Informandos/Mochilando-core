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
    private Diario diario;
    private String txtDia;

    public Dia() {
    }

    public Dia(Long seqDia, Diario diario, String txtDia) {
        this.seqDia = seqDia;
        this.diario = diario;
        this.txtDia = txtDia;
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

    /**
     * @return the diario
     */
    public Diario getDiario() {
        return diario;
    }

    /**
     * @param diario the diario to set
     */
    public void setDiario(Diario diario) {
        this.diario = diario;
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
