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
    public String inserir(Diario diario);
    public boolean alterar(Diario diario);
    public boolean remover(String codDiario);
    public Diario obterDiarioPorId(String codDiario);
    public List<Diario> listarTudo();
    public List<Diario> listarTudoPorUsuario(String codUsuario);
    public List<Diario> listarTudoPorCidade(String codCidade);
    public List<Diario> listarTudoPorEstado(String codEstado);
}
