package model.dao.interfaces;

/**
 *
 * @author Juliana
 */

import java.util.List;
import model.domain.Atracao;

public interface InterfaceAtracaoDAO {
    public String inserir(Atracao atracao);
    public boolean alterar(Atracao atracao);
    public boolean excluir(Atracao atracao);
    public Atracao consultarPorId(String codAtracao);
    public List<Atracao> listarPorCodCidade();
    public List<Atracao> listarPorCodEstado();
    public List<Atracao> listarTudo();
}
