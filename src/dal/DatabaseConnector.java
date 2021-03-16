package dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;

public class DatabaseConnector {
    SQLServerDataSource dataSource;

    public DatabaseConnector() {
        dataSource = new SQLServerDataSource();
        try {
            dataSource.setServerName("10.176.111.31");
            dataSource.setDatabaseName("MessagingProgram");
            dataSource.setUser("CSe20B_6");
            dataSource.setPassword("CSe20B_6");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLServerException {
        return dataSource.getConnection();
    }
}
