/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity_bill_generation;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sumit
 */
public class dbconnection {
   public static Connection con()
   {
       Connection con=null;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","");
           
           
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex);
           
       }
    
       return con;
   }
   
    
    
    
}
