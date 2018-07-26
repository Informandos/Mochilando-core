package model.dao.interfaces;

/**
 *
 * @author Juliana
 */

import java.util.List;
import model.domain.Atracao;
import model.excecao.ExcessaoPersistencia;

public interface InterfaceAtracaoDAO {
    public Long inserir(Atracao atracao) throws ExcessaoPersistencia;
    public boolean alterar(Atracao atracao) throws ExcessaoPersistencia;
    public boolean excluir(Atracao atracao) throws ExcessaoPersistencia;
    public Atracao consultarPorId(Long codAtracao) throws ExcessaoPersistencia;
    public List<Atracao> listarPorCodCidade(Long codCidade) throws ExcessaoPersistencia;
    public List<Atracao> listarPorCodEstado(Long codEstado) throws ExcessaoPersistencia;
    public List<Atracao> listarPorCodTipoAtracao(Long codTipoAtracao) throws ExcessaoPersistencia;
    public List<Atracao> listarTudo() throws ExcessaoPersistencia;
}
