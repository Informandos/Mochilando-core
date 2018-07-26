/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.TipoAtracao;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceTipoAtracaoDAO {
    public Long inserir(TipoAtracao tipoAtracao) throws ExcecaoPersistencia;
    public boolean alterar(TipoAtracao tipoAtracao) throws ExcecaoPersistencia;
    public boolean excluir(TipoAtracao tipoAtracao) throws ExcecaoPersistencia;
    public TipoAtracao consultarTipoAtracaoPorId(Long codTipoAtracao) throws ExcecaoPersistencia;
    public TipoAtracao consultarTipoAtracaoPorNome(String descTipoAtracao) throws ExcecaoPersistencia;
    public List<TipoAtracao> listarTudo() throws ExcecaoPersistencia;
}
