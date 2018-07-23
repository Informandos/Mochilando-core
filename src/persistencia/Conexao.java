/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juliana
 */
public class Conexao extends DadosAutenticarConexao implements ConexaoFactory {
    
   private final static String bdDriver = "org.postgresql.Driver";

    public Conexao() {
    }
    
    @Override
    public Connection getConexao() throws ClassNotFoundException, SQLException {
        Class.forName(bdDriver);
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConexaoFactory cf = new Conexao();            
        cf.getConexao();  
    }
}

