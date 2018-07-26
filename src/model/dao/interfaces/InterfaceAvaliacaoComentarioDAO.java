/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.AvaliacaoComentario;
import model.excecao.ExcecaoPersistencia;


/**
 *
 * @author Juliana
 */
public interface InterfaceAvaliacaoComentarioDAO {
    public Long inserir(AvaliacaoComentario avaliacaoComenario) throws ExcecaoPersistencia;
    public boolean alterar(AvaliacaoComentario avaliacaoComenario) throws ExcecaoPersistencia;
    public boolean excluir(AvaliacaoComentario avaliacaoComenario) throws ExcecaoPersistencia;
    public int consultarNumAvPositivas(Long codComentario) throws ExcecaoPersistencia;
    public int consultarNumAvNegativas(Long codComentario) throws ExcecaoPersistencia;
    public boolean haAvaliacao(Long codUsuario, Long codComentario) throws ExcecaoPersistencia;
    public AvaliacaoComentario consultar(Long codUsuario, Long codComentario) throws ExcecaoPersistencia;
    public List <AvaliacaoComentario> listarPorDiario(Long codDiario) throws ExcecaoPersistencia;
}
