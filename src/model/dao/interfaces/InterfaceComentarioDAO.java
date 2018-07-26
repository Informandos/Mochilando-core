/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Comentario;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceComentarioDAO {
    public Long inserir(Comentario comentario) throws ExcessaoPersistencia;
    public boolean alterar(Comentario comentario) throws ExcessaoPersistencia;
    public boolean excluir(Comentario comentario) throws ExcessaoPersistencia;
    public Comentario obterComentarioPorId(Long seqComentario) throws ExcessaoPersistencia;
    public List<Comentario> listarPorCodDiario(Long codDiario) throws ExcessaoPersistencia;
    public List<Comentario> listarTudo() throws ExcessaoPersistencia;
}
