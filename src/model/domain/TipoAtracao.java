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
public class TipoAtracao {
    private String codTipoAtracao;
    private String descTipoAtracao;

    public TipoAtracao() {
    }

    public TipoAtracao(String codTipoAtracao, String descTipoAtracao) {
        this.codTipoAtracao = codTipoAtracao;
        this.descTipoAtracao = descTipoAtracao;
    }

    /**
     * @return the codTipoAtracao
     */
    public String getCodTipoAtracao() {
        return codTipoAtracao;
    }

    /**
     * @param codTipoAtracao the codTipoAtracao to set
     */
    public void setCodTipoAtracao(String codTipoAtracao) {
        this.codTipoAtracao = codTipoAtracao;
    }

    /**
     * @return the descTipoAtracao
     */
    public String getDescTipoAtracao() {
        return descTipoAtracao;
    }

    /**
     * @param descTipoAtracao the descTipoAtracao to set
     */
    public void setDescTipoAtracao(String descTipoAtracao) {
        this.descTipoAtracao = descTipoAtracao;
    }
}
