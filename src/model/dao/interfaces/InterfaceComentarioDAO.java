/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Comentario;

/**
 *
 * @author Juliana
 */
public interface InterfaceComentarioDAO {
    public Long inserir(Comentario comentario);
    public boolean alterar(Comentario comentario);
    public boolean excluir(Long codComentario);
    public Comentario obterComentarioPorId(Long seqComentario);
    public List<Comentario> listarPorDiario(Long codDiario);
    public List<Comentario> listarTudo();
}
