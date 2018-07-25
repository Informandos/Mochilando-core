/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.DiaAtracao;

/**
 *
 * @author Juliana
 */

public interface InterfaceDiaAtracao {
    public Long inserir(DiaAtracao diaAtracao);
    public boolean alterar(DiaAtracao diaAtracao);
    public boolean excluir(DiaAtracao diaAtracao);
    public DiaAtracao consultarPorId(Long seqDiaAtracao);
    public List<DiaAtracao> listarTudo();
    public List<DiaAtracao> listarPorDia(Long seqDia);
}
