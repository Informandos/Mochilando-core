/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Foto;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceFotoDAO {
    public Long inserir(Foto foto) throws ExcessaoPersistencia;
    public boolean alterar(Foto foto) throws ExcessaoPersistencia;
    public boolean excluir(Foto foto) throws ExcessaoPersistencia;
    public Foto obterFotoPorId(Long seqFoto) throws ExcessaoPersistencia;
    public List<Foto> listarTudo() throws ExcessaoPersistencia;
    public List<Foto> listarPorDia(Long seqDia) throws ExcessaoPersistencia;
}
