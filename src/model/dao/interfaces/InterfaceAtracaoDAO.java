package model.dao.interfaces;

/**
 *
 * @author Juliana
 */

import java.util.List;
import model.domain.Atracao;
import model.excecao.ExcecaoPersistencia;

public interface InterfaceAtracaoDAO {
    public Long inserir(Atracao atracao) throws ExcecaoPersistencia;
    public boolean alterar(Atracao atracao) throws ExcecaoPersistencia;
    public boolean excluir(Atracao atracao) throws ExcecaoPersistencia;
    public Atracao consultarPorId(Long codAtracao) throws ExcecaoPersistencia;
    public List<Atracao> listarPorCodCidade(Long codCidade) throws ExcecaoPersistencia;
    public List<Atracao> listarPorCodEstado(Long codEstado) throws ExcecaoPersistencia;
    public List<Atracao> listarPorCodTipoAtracao(Long codTipoAtracao) throws ExcecaoPersistencia;
    public List<Atracao> listarTudo() throws ExcecaoPersistencia;
}
