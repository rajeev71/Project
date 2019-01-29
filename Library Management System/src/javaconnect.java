/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajeev Malhotra
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    
    
    public static Connection ConnecrDb()
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
            return conn;
        }   
       
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
