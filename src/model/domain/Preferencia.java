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
public class Preferencia {
    private String codPreferencia;
    private String descPreferencia;

    public Preferencia() {
    }

    public Preferencia(String codPreferencia, String descPreferencia) {
        this.codPreferencia = codPreferencia;
        this.descPreferencia = descPreferencia;
    }

    /**
     * @return the codPreferencia
     */
    public String getCodPreferencia() {
        return codPreferencia;
    }

    /**
     * @param codPreferencia the codPreferencia to set
     */
    public void setCodPreferencia(String codPreferencia) {
        this.codPreferencia = codPreferencia;
    }

    /**
     * @return the descPreferencia
     */
    public String getDescPreferencia() {
        return descPreferencia;
    }

    /**
     * @param descPreferencia the descPreferencia to set
     */
    public void setDescPreferencia(String descPreferencia) {
        this.descPreferencia = descPreferencia;
    }
    
}
