/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.awt.image.BufferedImage;

/**
 *
 * @author Juliana
 */
public class Foto {
    private String codAtracaoVisitada;
    private String seqFoto;
    private byte[] byteImgAtracao;
    private String codTipoAtracao;

    public Foto() {
    }

    public Foto(String codAtracaoVisitada, String seqFoto, byte[] byteImgAtracao, String codTipoAtracao) {
        this.codAtracaoVisitada = codAtracaoVisitada;
        this.seqFoto = seqFoto;
        this.byteImgAtracao = byteImgAtracao;
        this.codTipoAtracao = codTipoAtracao;
    }

    /**
     * @return the codAtracaoVisitada
     */
    public String getCodAtracaoVisitada() {
        return codAtracaoVisitada;
    }

    /**
     * @param codAtracaoVisitada the codAtracaoVisitada to set
     */
    public void setCodAtracaoVisitada(String codAtracaoVisitada) {
        this.codAtracaoVisitada = codAtracaoVisitada;
    }

    /**
     * @return the seqFoto
     */
    public String getSeqFoto() {
        return seqFoto;
    }

    /**
     * @param seqFoto the seqFoto to set
     */
    public void setSeqFoto(String seqFoto) {
        this.seqFoto = seqFoto;
    }

    /**
     * @return the byteImgAtracao
     */
    public byte[] getByteImgAtracao() {
        return byteImgAtracao;
    }

    /**
     * @param byteImgAtracao the byteImgAtracao to set
     */
    public void setByteImgAtracao(byte[] byteImgAtracao) {
        this.byteImgAtracao = byteImgAtracao;
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
}
