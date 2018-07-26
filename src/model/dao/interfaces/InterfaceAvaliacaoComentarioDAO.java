/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.AvaliacaoComentario;
import model.excecao.ExcessaoPersistencia;


/**
 *
 * @author Juliana
 */
public interface InterfaceAvaliacaoComentarioDAO {
    public Long inserir(AvaliacaoComentario avaliacaoComenario) throws ExcessaoPersistencia;
    public boolean alterar(AvaliacaoComentario avaliacaoComenario) throws ExcessaoPersistencia;
    public boolean excluir(AvaliacaoComentario avaliacaoComenario) throws ExcessaoPersistencia;
    public int consultarNumAvPositivas(Long codComentario) throws ExcessaoPersistencia;
    public int consultarNumAvNegativas(Long codComentario) throws ExcessaoPersistencia;
    public boolean haAvaliacao(Long codUsuario, Long codComentario) throws ExcessaoPersistencia;
    public AvaliacaoComentario consultar(Long codUsuario, Long codComentario) throws ExcessaoPersistencia;
    public List <AvaliacaoComentario> listarTudo() throws ExcessaoPersistencia;
}
