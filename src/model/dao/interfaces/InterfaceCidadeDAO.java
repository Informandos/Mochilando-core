/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Cidade;

/**
 *
 * @author Juliana
 */
public interface InterfaceCidadeDAO {
    public String inserir(Cidade cidade);
    public boolean alterar(Cidade cidade);
    public boolean excluir(Cidade cidade);
    public Cidade consultarCidadePorId(String codCidade);
    public List<Cidade> listarPorCodEstado(String codEstado);
    public List<Cidade> listarTudo();
}
