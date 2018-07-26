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
import util.db.exception.ExcecaoPersistencia;
import util.db.ConnectionManager;

/**
 *
 * @author Juliana
 */
public class TestarConexao {

    public static void main(String args[]) throws ClassNotFoundException, SQLException, ExcecaoPersistencia {
        System.out.print("Teste");
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "Select tablename from pg_tables Where schemaname = 'public' ";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            
            

            ResultSet rs = pstmt.executeQuery();
            
            String nome =  "\n";

            while (rs.next()) {
                nome += rs.getString("tablename")+"\n";
            }

            rs.close();
            pstmt.close();
            connection.close();
            System.out.println("nome: "+nome);

        } catch (ClassNotFoundException | SQLException e) {

            throw new ExcecaoPersistencia(e.getMessage(), e);

        }
    }
}
