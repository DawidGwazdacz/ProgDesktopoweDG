/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notatki;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Dawid
 */
public class DBClass {
     static private Connection connection;

    public static Connection getConnection() throws Exception{
        if(connection == null){
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        }
        return connection;
    }
}
