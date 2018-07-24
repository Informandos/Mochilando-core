/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.TipoAtracao;

/**
 *
 * @author Juliana
 */
public interface InterfaceTipoAtracaoDAO {
    public Long inserir(TipoAtracao tipoAtracao);
    public boolean alterar(TipoAtracao tipoAtracao);
    public boolean excluir(TipoAtracao tipoAtracao);
    public TipoAtracao consultarTipoAtracaoPorId(Long codTipoAtracao);
    public TipoAtracao consultarTipoAtracaoPorNome(String descTipoAtracao);
    public List<TipoAtracao> listarTudo();
}
