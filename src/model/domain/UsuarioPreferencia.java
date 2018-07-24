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
public class UsuarioPreferencia {
    private String seqUsuarioPreferencia;
    private String codUsuario;
    private String codPreferencia;

    public UsuarioPreferencia() {
    }

    public UsuarioPreferencia(String seqUsuarioPreferencia, String codUsuario, String codPreferencia) {
        this.seqUsuarioPreferencia = seqUsuarioPreferencia;
        this.codUsuario = codUsuario;
        this.codPreferencia = codPreferencia;
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
     * @return the seqUsuarioPreferencia
     */
    public String getSeqUsuarioPreferencia() {
        return seqUsuarioPreferencia;
    }

    /**
     * @param seqUsuarioPreferencia the seqUsuarioPreferencia to set
     */
    public void setSeqUsuarioPreferencia(String seqUsuarioPreferencia) {
        this.seqUsuarioPreferencia = seqUsuarioPreferencia;
    }
    
}
