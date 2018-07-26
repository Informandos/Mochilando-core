/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.AvaliacaoDiario;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceAvaliacaoDiarioDAO {
    public Long inserir(AvaliacaoDiario avaliacaoDiario) throws ExcessaoPersistencia;
    public boolean alterar(AvaliacaoDiario avaliacaoDiario) throws ExcessaoPersistencia;
    public boolean remover(AvaliacaoDiario avaliacaoDiario) throws ExcessaoPersistencia;
    public int consultarNumAvPositivas(Long codDiario) throws ExcessaoPersistencia;
    public int consultarNumAvNegativas(Long codDiario) throws ExcessaoPersistencia;
    public boolean haAvaliacao(Long codUsuario, Long codDiario) throws ExcessaoPersistencia;
    public AvaliacaoDiario consultar(Long codUsuario, Long codDiario) throws ExcessaoPersistencia;
    public List<AvaliacaoDiario> listarPorDiario(Long codDiario) throws ExcessaoPersistencia;
}
