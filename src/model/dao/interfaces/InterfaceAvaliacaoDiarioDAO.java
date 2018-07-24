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
    public Long inserir(AvaliacaoDiario avaliacaoDiario);
    public boolean alterar(AvaliacaoDiario avaliacaoDiario);
    public boolean remover(AvaliacaoDiario avaliacaoDiario);
    public int consultarNumAvPositivas(Long codDiario);
    public int consultarNumAvNegativas(Long codDiario);
    public boolean haAvaliacao(Long codUsuario, Long codDiario);
    public AvaliacaoDiario consultarAvaliacao(Long codUsuario, Long codDiario);
}
