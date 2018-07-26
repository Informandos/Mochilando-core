/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Cidade;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceCidadeDAO {
    public Long inserir(Cidade cidade) throws ExcessaoPersistencia;
    public boolean alterar(Cidade cidade) throws ExcessaoPersistencia;
    public boolean excluir(Cidade cidade) throws ExcessaoPersistencia;
    public Cidade consultarCidadePorId(Long codCidade) throws ExcessaoPersistencia;
    public List<Cidade> listarPorCodEstado(Long codEstado) throws ExcessaoPersistencia;
    public List<Cidade> listarTudo() throws ExcessaoPersistencia;
}
