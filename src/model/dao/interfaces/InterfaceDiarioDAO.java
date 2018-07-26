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
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceDiarioDAO {
    public Long inserir(Diario diario) throws ExcessaoPersistencia;
    public boolean alterar(Diario diario) throws ExcessaoPersistencia;
    public boolean excluir(Diario diario) throws ExcessaoPersistencia;
    public Diario consultarDiarioPorId(Long codDiario) throws ExcessaoPersistencia;
    public List<Diario> listarTudo() throws ExcessaoPersistencia;
    public List<Diario> listarPorUsuario(Usuario usuario) throws ExcessaoPersistencia;
    public List<Diario> listarPorCidade(Cidade cidade) throws ExcessaoPersistencia;
    public List<Diario> listarPorEstado(Estado estado) throws ExcessaoPersistencia;
}
