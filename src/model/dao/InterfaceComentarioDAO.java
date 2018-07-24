/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.domain.Comentario;

/**
 *
 * @author Juliana
 */
public interface InterfaceComentarioDAO {
    public Long insert(Comentario comentario);
    public boolean update(Comentario comentario);
    public boolean remove(String codComentario);
    public Comentario getComentarioById(String seqComentario);
    public List<Comentario> listAll() ;
}
