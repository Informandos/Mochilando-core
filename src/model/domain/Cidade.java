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
public class Cidade {
    
    private Long codCidade;
    private Long codEstado;
    private String nomCidade;

    public Cidade() {
    }

    public Cidade(Long codCidade, Long codEstado, String nomCidade) {
        this.codCidade = codCidade;
        this.codEstado = codEstado;
        this.nomCidade = nomCidade;
    }

    /**
     * @return the codCidade
     */
    public Long getCodCidade() {
        return codCidade;
    }

    /**
     * @param codCidade the codCidade to set
     */
    public void setCodCidade(Long codCidade) {
        this.codCidade = codCidade;
    }

    /**
     * @return the codEsstado
     */
    public Long getCodEstado() {
        return codEstado;
    }

    /**
     * @param codEsstado the codEsstado to set
     */
    public void setCodEsstado(Long codEstado) {
        this.codEstado = codEstado;
    }

    /**
     * @return the nomCidade
     */
    public String getNomCidade() {
        return nomCidade;
    }

    /**
     * @param nomCidade the nomCidade to set
     */
    public void setNomCidade(String nomCidade) {
        this.nomCidade = nomCidade;
    }
}
