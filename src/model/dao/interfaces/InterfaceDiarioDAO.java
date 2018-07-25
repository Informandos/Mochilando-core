/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Cidade;
import model.domain.Diario;
import model.domain.Estado;
import model.domain.Usuario;

/**
 *
 * @author Juliana
 */
public interface InterfaceDiarioDAO {
    public Long inserir(Diario diario);
    public boolean alterar(Diario diario);
    public boolean excluir(Diario diario);
    public Diario consultarDiarioPorId(Long codDiario);
    public List<Diario> listarTudo();
    public List<Diario> listarPorUsuario(Usuario usuario);
    public List<Diario> listarPorCidade(Cidade cidade);
    public List<Diario> listarPorEstado(Estado estado);
}
