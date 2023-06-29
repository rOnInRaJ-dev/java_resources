
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import javax.swing.JOptionPane;



public class DBConnect {

    public static void main(String[] args) {
//       try {
//           String host = "jdbc:mysql://localhost:3306/impigerinternapp";
//           String userName = "root";
//           String password = "";
//           
//           
//           Connection connection = DriverManager.getConnection(host, userName, password);
//       }
//       
//       catch (SQLException error) {
//           System.out.println(error.getMessage());
//       }
//       
//       
//           System.out.println("Connection Successful");


try {
            
            
            Connection connection = null;
            
            String host = "jdbc:mysql://localhost:3306/attendance";
            String userName = "root";
            String password = "";
        
            connection = DriverManager.getConnection(host, userName, password);
            
            if (connection != null) { System.out.println("Successfully connected to MySQL database test"); }
        
//            statement = connection.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
//                                                   ResultSet.CONCUR_UPDATABLE );
            String SQL = "SELECT * FROM `internreport` ";
        
        }catch(SQLException error){
            System.out.println(error.getMessage());
            
        }
       
    }
    
}
