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
public class Atracao {
    
    private String seqAtracao;
    private String codTipoAtracao;
    private String codCidadeAtracao;
    private String desAtracao;
    private double nroLatitude;
    private double nroLongitude;

    public Atracao() {
    }

    public Atracao(String seqAtracao, String codTipoAtracao, String codCidadeAtracao, String desAtracao, double nroLatitude, double nroLongitude) {
        this.seqAtracao = seqAtracao;
        this.codTipoAtracao = codTipoAtracao;
        this.codCidadeAtracao = codCidadeAtracao;
        this.desAtracao = desAtracao;
        this.nroLatitude = nroLatitude;
        this.nroLongitude = nroLongitude;
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
     * @return the codCidadeAtracao
     */
    public String getCodCidadeAtracao() {
        return codCidadeAtracao;
    }

    /**
     * @param codCidadeAtracao the codCidadeAtracao to set
     */
    public void setCodCidadeAtracao(String codCidadeAtracao) {
        this.codCidadeAtracao = codCidadeAtracao;
    }

    /**
     * @return the desAtracao
     */
    public String getDesAtracao() {
        return desAtracao;
    }

    /**
     * @param desAtracao the desAtracao to set
     */
    public void setDesAtracao(String desAtracao) {
        this.desAtracao = desAtracao;
    }

    /**
     * @return the nroLatitude
     */
    public double getNroLatitude() {
        return nroLatitude;
    }

    /**
     * @param nroLatitude the nroLatitude to set
     */
    public void setNroLatitude(double nroLatitude) {
        this.nroLatitude = nroLatitude;
    }

    /**
     * @return the nroLongitude
     */
    public double getNroLongitude() {
        return nroLongitude;
    }

    /**
     * @param nroLongitude the nroLongitude to set
     */
    public void setNroLongitude(double nroLongitude) {
        this.nroLongitude = nroLongitude;
    }
    
}
