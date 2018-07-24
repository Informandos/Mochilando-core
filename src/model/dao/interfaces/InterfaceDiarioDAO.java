/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Diario;

/**
 *
 * @author Juliana
 */
public interface InterfaceDiarioDAO {
    public Long inserir(Diario diario);
    public boolean alterar(Diario diario);
    public boolean remover(Long codDiario);
    public Diario obterDiarioPorId(Long codDiario);
    public List<Diario> listarTudo();
    public List<Diario> listarTudoPorUsuario(Long codUsuario);
    public List<Diario> listarTudoPorCidade(Long codCidade);
    public List<Diario> listarTudoPorEstado(Long codEstado);
}
