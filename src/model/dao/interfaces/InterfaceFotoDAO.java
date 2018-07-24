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
    public String inserir(Foto foto);
    public boolean alterar(Foto foto);
    public boolean excluir(String seqFoto);
    public Foto obterFotoPorId(String seqFoto);
    public List<Foto> listarTudo();
    public List<Foto> listarTudoPorDia(String seqDia);
}
