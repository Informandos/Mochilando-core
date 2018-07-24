package model.dao.interfaces;

/**
 *
 * @author Juliana
 */

import java.util.List;
import model.domain.Atracao;

public interface InterfaceAtracaoDAO {
    public Long inserir(Atracao atracao);
    public boolean alterar(Atracao atracao);
    public boolean excluir(Atracao atracao);
    public Atracao consultarPorId(Long codAtracao);
    public List<Atracao> listarPorCodCidade(Long codCidade);
    public List<Atracao> listarPorCodEstado(Long codEstado);
    public List<Atracao> listarTudo();
}
