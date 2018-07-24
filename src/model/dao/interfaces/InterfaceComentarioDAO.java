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
    public String inserir(Comentario comentario);
    public boolean alterar(Comentario comentario);
    public boolean excluir(String codComentario);
    public Comentario obterComentarioPorId(String seqComentario);
    public List<Comentario> listarPorDiario(String codDiario);
    public List<Comentario> listarTudo();
}
