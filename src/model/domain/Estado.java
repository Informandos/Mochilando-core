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
public class Estado {
    
    private String codEstado;
    private String nomEstado;

    public Estado() {
    }

    public Estado(String codEstado, String nomEstado) {
        this.codEstado = codEstado;
        this.nomEstado = nomEstado;
    }

    /**
     * @return the codEstado
     */
    public String getCodEstado() {
        return codEstado;
    }

    /**
     * @param codEstado the codEstado to set
     */
    public void setCodEstado(String codEstado) {
        this.codEstado = codEstado;
    }

    /**
     * @return the nomEstado
     */
    public String getNomEstado() {
        return nomEstado;
    }

    /**
     * @param nomEstado the nomEstado to set
     */
    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }
    
}
