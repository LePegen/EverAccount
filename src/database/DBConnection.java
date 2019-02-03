package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gene Garcia
 */
public class DBConnection {

    private Connection connection;
    private Statement statement;
    private ResultSet dataStore;

    private String HOST = "jdbc:derby://localhost:1527/LeznedEverAccount";
    private String USERNAME = "Lezned";
    private String PASSWORD = "denzel";

    public DBConnection() throws SQLException {
        connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    public void executeCommand(String sql) throws SQLException {
        this.dataStore = this.statement.executeQuery(sql);
    }

    public void executeUpdate(String sql) throws SQLException {
        this.statement.executeUpdate(sql);

    }

    public void executeCommand(String sql, boolean isUpdate) throws SQLException {
        if (isUpdate) {
            statement.executeUpdate(sql);
        } else {
            statement.execute(sql);
        }

    }

    public ResultSet getData() {
        return this.dataStore;
    }

    public void openConnection() {

    }

    public void closeConnection() {

    }

}
