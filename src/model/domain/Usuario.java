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
public class Usuario {
    private String codUsuario;
    private String nomUsuario;
    private String sobrenomeUsuario;
    private String txtEmail;
    private String txtSenha;
    private byte[] imgPerfil;

    public Usuario() {
    }

    public Usuario(String codUsuario, String codTipoAtracao, String nomUsuario, String sobrenomeUsuario, String txtEmail, String txtSenha, byte[] imgPerfil) {
        this.codUsuario = codUsuario;
        this.nomUsuario = nomUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
        this.txtEmail = txtEmail;
        this.txtSenha = txtSenha;
        this.imgPerfil = imgPerfil;
    }

    /**
     * @return the codUsuario
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * @param codUsuario the codUsuario to set
     */
    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }


    /**
     * @return the nomUsuario
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * @param nomUsuario the nomUsuario to set
     */
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    /**
     * @return the sobrenomeUsuario
     */
    public String getSobrenomeUsuario() {
        return sobrenomeUsuario;
    }

    /**
     * @param sobrenomeUsuario the sobrenomeUsuario to set
     */
    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenomeUsuario = sobrenomeUsuario;
    }

    /**
     * @return the txtEmail
     */
    public String getTxtEmail() {
        return txtEmail;
    }

    /**
     * @param txtEmail the txtEmail to set
     */
    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    /**
     * @return the txtSenha
     */
    public String getTxtSenha() {
        return txtSenha;
    }

    /**
     * @param txtSenha the txtSenha to set
     */
    public void setTxtSenha(String txtSenha) {
        this.txtSenha = txtSenha;
    }

    /**
     * @return the imgPerfil
     */
    public byte[] getImgPerfil() {
        return imgPerfil;
    }

    /**
     * @param imgPerfil the imgPerfil to set
     */
    public void setImgPerfil(byte[] imgPerfil) {
        this.imgPerfil = imgPerfil;
    }
    
    
}
