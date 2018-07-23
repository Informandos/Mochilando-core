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
public class AvaliacaoDiario {
    private String codDiario;
    private String codUsuarioAvaliador;
    private String avaliacao; //limitar em dois valores

    public AvaliacaoDiario() {
    }

    public AvaliacaoDiario(String codDiario, String codUsuarioAvaliador, String avaliacao) {
        this.codDiario = codDiario;
        this.codUsuarioAvaliador = codUsuarioAvaliador;
        this.avaliacao = avaliacao;
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
     * @return the codUsuarioAvaliador
     */
    public String getCodUsuarioAvaliador() {
        return codUsuarioAvaliador;
    }

    /**
     * @param codUsuarioAvaliador the codUsuarioAvaliador to set
     */
    public void setCodUsuarioAvaliador(String codUsuarioAvaliador) {
        this.codUsuarioAvaliador = codUsuarioAvaliador;
    }

    /**
     * @return the avaliacao
     */
    public String getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliacao the avaliacao to set
     */
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}
