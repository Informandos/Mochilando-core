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
    private Long seqUsuarioPreferencia;
    private Usuario usuario;
    private Preferencia preferencia;

    public UsuarioPreferencia() {
    }

    public UsuarioPreferencia(Long seqUsuarioPreferencia, Usuario usuario, Preferencia preferencia) {
        this.seqUsuarioPreferencia = seqUsuarioPreferencia;
        this.usuario = usuario;
        this.preferencia = preferencia;
    }

    public Long getSeqUsuarioPreferencia() {
        return seqUsuarioPreferencia;
    }

    public void setSeqUsuarioPreferencia(Long seqUsuarioPreferencia) {
        this.seqUsuarioPreferencia = seqUsuarioPreferencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }

    
}
