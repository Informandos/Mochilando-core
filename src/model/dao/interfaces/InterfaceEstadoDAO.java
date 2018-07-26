/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Estado;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceEstadoDAO {
    public Long inserir(Estado estado) throws ExcessaoPersistencia;
    public boolean alterar(Estado estado) throws ExcessaoPersistencia;
    public boolean excluir(Estado estado) throws ExcessaoPersistencia;
    public Estado consultarPorId(Long codEstado) throws ExcessaoPersistencia;
    public Estado consultarPorSigla(String sigla) throws ExcessaoPersistencia;
    public List<Estado> listarTudo() throws ExcessaoPersistencia;
}
