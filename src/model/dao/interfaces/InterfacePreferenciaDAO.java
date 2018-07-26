/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Preferencia;
import model.excecao.ExcecaoPersistencia;

/**
 *
 * @author Juliana
 */
public interface InterfacePreferenciaDAO {
    public Long inserir(Preferencia preferencia) throws ExcecaoPersistencia;
    public boolean alterar(Preferencia preferencia) throws ExcecaoPersistencia;
    public boolean excluir(Preferencia preferencia) throws ExcecaoPersistencia;
    public Preferencia consultarPreferenciaPorId(Long codPreferencia) throws ExcecaoPersistencia;
    public Preferencia consultarPreferenciaPorNome(String descPreferencia) throws ExcecaoPersistencia;
    public List<Preferencia> listarTudo() throws ExcecaoPersistencia;
}
