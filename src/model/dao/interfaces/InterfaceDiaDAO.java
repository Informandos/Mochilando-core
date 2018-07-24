/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Dia;

/**
 *
 * @author Juliana
 */
public interface InterfaceDiaDAO {
    public Long inserir(Dia dia);
    public boolean alterar(Dia dia);
    public boolean remover(Long seqDia);
    public Dia obterDiaPorId(Long seqDia);
    public List<Dia> listarTudoPorDiario(Long seqDiario); 
}
