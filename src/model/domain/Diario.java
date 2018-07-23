/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain;

import java.util.Date;

/**
 *
 * @author Juliana
 */
public class Diario {
    private String codDiario;
    private String codUsuarioAutor;
    private String nomDiario;
    private Date datPublicacao;
    private Date datInicioViagem;
    private Date datFimViagem;
    private String desDiario;
    private String txtDiario;

    public Diario() {
    }

    public Diario(String codDiario, String codUsuarioAutor, String nomDiario, Date datPublicacao, Date datInicioViagem, Date datFimViagem, String desDiario, String txtDiario) {
        this.codDiario = codDiario;
        this.codUsuarioAutor = codUsuarioAutor;
        this.nomDiario = nomDiario;
        this.datPublicacao = datPublicacao;
        this.datInicioViagem = datInicioViagem;
        this.datFimViagem = datFimViagem;
        this.desDiario = desDiario;
        this.txtDiario = txtDiario;
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
     * @return the codUsuarioAutor
     */
    public String getCodUsuarioAutor() {
        return codUsuarioAutor;
    }

    /**
     * @param codUsuarioAutor the codUsuarioAutor to set
     */
    public void setCodUsuarioAutor(String codUsuarioAutor) {
        this.codUsuarioAutor = codUsuarioAutor;
    }

    /**
     * @return the nomDiario
     */
    public String getNomDiario() {
        return nomDiario;
    }

    /**
     * @param nomDiario the nomDiario to set
     */
    public void setNomDiario(String nomDiario) {
        this.nomDiario = nomDiario;
    }

    /**
     * @return the datPublicacao
     */
    public Date getDatPublicacao() {
        return datPublicacao;
    }

    /**
     * @param datPublicacao the datPublicacao to set
     */
    public void setDatPublicacao(Date datPublicacao) {
        this.datPublicacao = datPublicacao;
    }

    /**
     * @return the datInicioViagem
     */
    public Date getDatInicioViagem() {
        return datInicioViagem;
    }

    /**
     * @param datInicioViagem the datInicioViagem to set
     */
    public void setDatInicioViagem(Date datInicioViagem) {
        this.datInicioViagem = datInicioViagem;
    }

    /**
     * @return the datFimViagem
     */
    public Date getDatFimViagem() {
        return datFimViagem;
    }

    /**
     * @param datFimViagem the datFimViagem to set
     */
    public void setDatFimViagem(Date datFimViagem) {
        this.datFimViagem = datFimViagem;
    }

    /**
     * @return the desDiario
     */
    public String getDesDiario() {
        return desDiario;
    }

    /**
     * @param desDiario the desDiario to set
     */
    public void setDesDiario(String desDiario) {
        this.desDiario = desDiario;
    }

    /**
     * @return the txtDiario
     */
    public String getTxtDiario() {
        return txtDiario;
    }

    /**
     * @param txtDiario the txtDiario to set
     */
    public void setTxtDiario(String txtDiario) {
        this.txtDiario = txtDiario;
    }
    
}
