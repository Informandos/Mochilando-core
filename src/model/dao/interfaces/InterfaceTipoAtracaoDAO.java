/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.TipoAtracao;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceTipoAtracaoDAO {
    public Long inserir(TipoAtracao tipoAtracao) throws ExcessaoPersistencia;
    public boolean alterar(TipoAtracao tipoAtracao) throws ExcessaoPersistencia;
    public boolean excluir(TipoAtracao tipoAtracao) throws ExcessaoPersistencia;
    public TipoAtracao consultarTipoAtracaoPorId(Long codTipoAtracao) throws ExcessaoPersistencia;
    public TipoAtracao consultarTipoAtracaoPorNome(String descTipoAtracao) throws ExcessaoPersistencia;
    public List<TipoAtracao> listarTudo() throws ExcessaoPersistencia;
}
