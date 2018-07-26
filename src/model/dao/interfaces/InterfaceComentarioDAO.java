/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Comentario;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceComentarioDAO {
    public Long inserir(Comentario comentario) throws ExcecaoPersistencia;
    public boolean alterar(Comentario comentario) throws ExcecaoPersistencia;
    public boolean excluir(Comentario comentario) throws ExcecaoPersistencia;
    public Comentario obterComentarioPorId(Long seqComentario) throws ExcecaoPersistencia;
    public List<Comentario> listarPorCodDiario(Long codDiario) throws ExcecaoPersistencia;
    public List<Comentario> listarTudo() throws ExcecaoPersistencia;
}
