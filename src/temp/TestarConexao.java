/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.domain.Usuario;
import model.service.implementacao.ManterUsuario;
import util.db.exception.ExcecaoPersistencia;
import util.db.ConnectionManager;

/**
 *
 * @author Juliana
 */
public class TestarConexao {

    public static void main(String args[]) throws ClassNotFoundException, SQLException, ExcecaoPersistencia {
        System.out.print("Teste");
        ManterUsuario MU = new ManterUsuario();
        Usuario u = MU.getUserLogin("joaozinhocouto@gmail.com", "senha");
        System.out.print(u.getNomUsuario());
    }
}
