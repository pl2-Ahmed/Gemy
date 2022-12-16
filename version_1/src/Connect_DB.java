/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamed
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect_DB {
    
      static private String user="root";
    static private String password="";
    static private String address="jdbc:mysql://localhost/javatesting";
    public Connection connect()throws SQLException{
            Connection c = DriverManager.getConnection(address,user,password);
            return c;
    }
}
