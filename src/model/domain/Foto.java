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

    private Long seqFoto;
    private Long seqDia;
    private byte[] byteFoto;

    public Foto() {
    }

    public Foto(Long seqFoto, Long seqDia, byte[] byteFoto) {
        this.seqFoto = seqFoto;
        this.seqDia = seqDia;
        this.byteFoto = byteFoto;
    }

    /**
     * @return the seqFoto
     */
    public Long getSeqFoto() {
        return seqFoto;
    }

    /**
     * @param seqFoto the seqFoto to set
     */
    public void setSeqFoto(Long seqFoto) {
        this.seqFoto = seqFoto;
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
     * @return the byteFoto
     */
    public byte[] getByteFoto() {
        return byteFoto;
    }

    /**
     * @param byteFoto the byteFoto to set
     */
    public void setByteFoto(byte[] byteFoto) {
        this.byteFoto = byteFoto;
    }
}
