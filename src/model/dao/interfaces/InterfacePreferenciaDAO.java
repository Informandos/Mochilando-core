/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Preferencia;
import model.excecao.ExcessaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfacePreferenciaDAO {
    public Long inserir(Preferencia preferencia) throws ExcessaoPersistencia;
    public boolean alterar(Preferencia preferencia) throws ExcessaoPersistencia;
    public boolean excluir(Preferencia preferencia) throws ExcessaoPersistencia;
    public Preferencia consultarPreferenciaPorId(Long codPreferencia) throws ExcessaoPersistencia;
    public Preferencia consultarPreferenciaPorNome(String descPreferencia) throws ExcessaoPersistencia;
    public List<Preferencia> listarTudo() throws ExcessaoPersistencia;
}
