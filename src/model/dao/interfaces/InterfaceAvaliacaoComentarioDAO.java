/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.AvaliacaoComentario;


/**
 *
 * @author Juliana
 */
public interface InterfaceAvaliacaoComentarioDAO {
    public Long inserir(AvaliacaoComentario avaliacaoComenario);
    public boolean alterar(AvaliacaoComentario avaliacaoComenario);
    public boolean excluir(AvaliacaoComentario avaliacaoComenario);
    public int consultarNumAvPositivas(Long codComentario);
    public int consultarNumAvNegativas(Long codComentario);
    public boolean haAvaliacao(Long codUsuario, Long codComentario);
    public AvaliacaoComentario consultar(Long codUsuario, Long codComentario);
    public List <AvaliacaoComentario> listarTudo();
}
