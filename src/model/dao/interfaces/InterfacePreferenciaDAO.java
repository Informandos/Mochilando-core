/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Preferencia;

/**
 *
 * @author Juliana
 */
public interface InterfacePreferenciaDAO {
    public String inserir(Preferencia preferencia);
    public boolean alterar(Preferencia preferencia);
    public boolean excluir(Preferencia preferencia);
    public Preferencia consultarPreferenciaPorId(String codPreferencia);
    public Preferencia consultarPreferenciaPorNome(String descPreferencia);
    public List<Preferencia> listarTudo();
}
