/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.breno.botwarmory.model.database.connection;

import co.breno.botwarmory.exception.NotConnectionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author breno
 */
public class ConnectionSingleton {
    
    private static Connection connection;

    public ConnectionSingleton() {
    }
    
    public static Connection getConnection() throws NotConnectionException {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                connection = DriverManager.getConnection(
                    "jdbc:mysql://mysql.breno.co/breno?" + 
                    "user=breno" +
                    "&password=cxzsrafwq321"
                );
                System.out.println("MySQL connection successful!");
            } 
        } catch (SQLException | ClassNotFoundException ex) {
            // Trata o erro.
            System.out.println("MySQL Error:");
            System.out.println(ex.getMessage());
            throw new NotConnectionException();
        }
        
        return connection;
    }
}
