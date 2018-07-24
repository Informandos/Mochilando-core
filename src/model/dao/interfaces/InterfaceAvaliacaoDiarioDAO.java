/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.AvaliacaoDiario;

/**
 *
 * @author Juliana
 */
public interface InterfaceAvaliacaoDiarioDAO {
    public String inserir(AvaliacaoDiario avaliacaoDiario);
    public boolean alterar(AvaliacaoDiario avaliacaoDiario);
    public boolean remover(AvaliacaoDiario avaliacaoDiario);
    public int consultarNumAvPositivas(String codDiario);
    public int consultarNumAvNegativas(String codDiario);
    public boolean haAvaliacao(String codUsuario, String codDiario);
    public AvaliacaoDiario consultarAvaliacao(String codUsuario, String codDiario);
}
