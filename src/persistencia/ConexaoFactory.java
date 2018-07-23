/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Juliana
 */
public interface ConexaoFactory {
    
    public Connection getConexao() throws ClassNotFoundException, SQLException;
}
