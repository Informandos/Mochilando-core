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
public class TagDiario {
    
    private Long seqTagDiario;
    private Diario diario;
    private Preferencia preferencia;

    public TagDiario() {
    }

    public TagDiario(Long seqTagDiario, Diario diario, Preferencia preferencia) {
        this.seqTagDiario = seqTagDiario;
        this.diario = diario;
        this.preferencia = preferencia;
    }

    public Long getSeqTagDiario() {
        return seqTagDiario;
    }

    public void setSeqTagDiario(Long seqTagDiario) {
        this.seqTagDiario = seqTagDiario;
    }

    public Diario getDiario() {
        return diario;
    }

    public void setDiario(Diario diario) {
        this.diario = diario;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }
    
}
