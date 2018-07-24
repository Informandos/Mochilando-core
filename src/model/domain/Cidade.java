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
    
    private String codCidade;
    private String codEsstado;
    private String nomCidade;

    public Cidade() {
    }

    public Cidade(String codCidade, String codEsstado, String nomCidade) {
        this.codCidade = codCidade;
        this.codEsstado = codEsstado;
        this.nomCidade = nomCidade;
    }

    /**
     * @return the codCidade
     */
    public String getCodCidade() {
        return codCidade;
    }

    /**
     * @param codCidade the codCidade to set
     */
    public void setCodCidade(String codCidade) {
        this.codCidade = codCidade;
    }

    /**
     * @return the codEsstado
     */
    public String getCodEsstado() {
        return codEsstado;
    }

    /**
     * @param codEsstado the codEsstado to set
     */
    public void setCodEsstado(String codEsstado) {
        this.codEsstado = codEsstado;
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
