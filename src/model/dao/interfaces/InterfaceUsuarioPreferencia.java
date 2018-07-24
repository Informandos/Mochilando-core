/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.UsuarioPreferencia;

/**
 *
 * @author Juliana
 */
public interface InterfaceUsuarioPreferencia {
    public Long inserir(UsuarioPreferencia usuarioPreferencia);
    public boolean alterar(UsuarioPreferencia usuarioPreferencia);
    public boolean excluir(UsuarioPreferencia usuarioPreferencia);
    public UsuarioPreferencia consultarPorId(String seqUsuarioPreferencia);
    public List<UsuarioPreferencia> listarTudo();
    public List<UsuarioPreferencia> listarTudoPorUsuario(String codUsuario);
}
