/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.db;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Juliana
 */
public class GerenciadorConexao {

    private static GerenciadorConexao conexao;
    private static ConnectionFactory cf;

    private GerenciadorConexao() {
         GerenciadorConexao.cf = new PostgresqlConnection();
    }

    public static GerenciadorConexao getInstance() {
        if(conexao == null)
            conexao = new GerenciadorConexao();

        return conexao;
    }

    public Connection getConexao() throws ClassNotFoundException, SQLException {

        return GerenciadorConexao.cf.getConexao();
    }
    
}
