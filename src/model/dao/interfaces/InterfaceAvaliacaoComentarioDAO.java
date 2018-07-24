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
    public String inserir(AvaliacaoComentario avaliacaoComenario);
    public boolean alterar(AvaliacaoComentario avaliacaoComenario);
    public boolean excluir(AvaliacaoComentario avaliacaoComenario);
    public int consultarNumAvPositivas(String codComentario);
    public int consultarNumAvNegativas(String codComentario);
    public boolean haAvaliacao(String codUsuario, String codComentario);
    public AvaliacaoComentario consultar(String codUsuario, String codComentario);
    public List <AvaliacaoComentario> listarTudo();
}
