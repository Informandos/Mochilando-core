/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.interfaces;

import java.util.List;
import model.domain.Foto;

/**
 *
 * @author Juliana
 */
public interface InterfaceFotoDAO {
    public Long inserir(Foto foto);
    public boolean alterar(Foto foto);
    public boolean excluir(Long seqFoto);
    public Foto obterFotoPorId(Long seqFoto);
    public List<Foto> listarTudo();
    public List<Foto> listarTudoPorDia(Long seqDia);
}
