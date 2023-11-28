package springHibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author RizkyBagaskara
 */
public class koneksi {
    static Connection c;
    
    public static Connection connection(){
        if (c == null){
            try{
                String url = "jdbc:mysql://localhost:3306/belajar"; // Nama Database
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                c = DriverManager.getConnection(url, user, password);
            }
            catch(SQLException e){
                System.out.println("Error membuat koneksi");
            }
        }
        return c;
    }
}
