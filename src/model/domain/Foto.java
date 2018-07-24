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

    private String seqFoto;
    private String seqDia;
    private byte[] byteFoto;

    public Foto() {
    }

    public Foto(String seqFoto, String seqDia, byte[] byteFoto) {
        this.seqFoto = seqFoto;
        this.seqDia = seqDia;
        this.byteFoto = byteFoto;
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
     * @return the seqDia
     */
    public String getSeqDia() {
        return seqDia;
    }

    /**
     * @param seqDia the seqDia to set
     */
    public void setSeqDia(String seqDia) {
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
