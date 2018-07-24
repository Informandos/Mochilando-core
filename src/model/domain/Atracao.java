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
    
    private Long seqAtracao;
    private Long codCidadeAtracao;
    private Long codTipoAtracao;
    private String nomAtracao;
    private double nroLatitude;
    private double nroLongitude;

    public Atracao() {
    }

    public Atracao(Long seqAtracao, Long codTipoAtracao, Long codCidadeAtracao, String nomAtracao, double nroLatitude, double nroLongitude) {
        this.seqAtracao = seqAtracao;
        this.codTipoAtracao = codTipoAtracao;
        this.codCidadeAtracao = codCidadeAtracao;
        this.nomAtracao = nomAtracao;
        this.nroLatitude = nroLatitude;
        this.nroLongitude = nroLongitude;
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
     * @return the codTipoAtracao
     */
    public Long getCodTipoAtracao() {
        return codTipoAtracao;
    }

    /**
     * @param codTipoAtracao the codTipoAtracao to set
     */
    public void setCodTipoAtracao(Long codTipoAtracao) {
        this.codTipoAtracao = codTipoAtracao;
    }

    /**
     * @return the codCidadeAtracao
     */
    public Long getCodCidadeAtracao() {
        return codCidadeAtracao;
    }

    /**
     * @param codCidadeAtracao the codCidadeAtracao to set
     */
    public void setCodCidadeAtracao(Long codCidadeAtracao) {
        this.codCidadeAtracao = codCidadeAtracao;
    }

    /**
     * @return the desAtracao
     */
    public String getNomAtracao() {
        return nomAtracao;
    }

    /**
     * @param desAtracao the desAtracao to set
     */
    public void setNomAtracao(String desAtracao) {
        this.nomAtracao = desAtracao;
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
