import java.sql.*;

public class DbHelper {
    private String userName = "root";
    private String password = "Sifreis123";
    private String url = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url,userName,password);
    }
    
    public void showErrorMessage(SQLException excepiton)
    {
        System.out.println("Error: "+excepiton.getMessage());
        System.out.println("Error Code: "+excepiton.getErrorCode());
    }
    
}
