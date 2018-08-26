/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author chr97lubuntu
 */
public class NuevaConexion {
    Connection cn;
    Statement st;
    public Connection conexxion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personah1", "root", "1997");
            cn.setAutoCommit(false);//para que no utilice el commit automaticamente
            
      
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("no conecta localhost::3306");
        }
        return cn;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
}
}
