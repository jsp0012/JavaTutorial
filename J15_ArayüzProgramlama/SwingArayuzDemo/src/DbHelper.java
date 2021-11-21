
import java.sql.*;
public class DbHelper {
    private String UserName = "root";
    private String password = "1234";
    private String ConnectionString = "jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(ConnectionString,UserName,password);
    }
    
    public void showErrorMesage(SQLException e)
    {
        System.out.println("Hata oluştu: "+e.getMessage());
        System.out.println("Hata kodu : "+ e.getErrorCode());
    }
    
}
