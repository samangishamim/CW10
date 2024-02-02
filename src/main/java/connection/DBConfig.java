package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

    private static Connection connection = null;
    public DBConfig () {}

    public static Connection getConnection()  {
        if (connection==null){
            String url="jdbc:postgresql://localhost:5432/cw10";
            String username="postgres";
            String password="1399ar";
            try {
                connection= DriverManager.getConnection(url,username,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
