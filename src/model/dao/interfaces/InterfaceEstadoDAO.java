/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Estado;

/**
 *
 * @author Juliana
 */
public interface InterfaceEstadoDAO {
    public Long inserir(Estado estado);
    public boolean alterar(Estado estado);
    public boolean excluir(Estado estado);
    public Estado consultarPorId(Long codEstado);
    public Estado consultarPorSigla(Long codEstado);
    public List<Estado> listarTudo();
}
