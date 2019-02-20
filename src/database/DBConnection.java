package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author Lezned
 */
public class DBConnection {

    private Connection connection;
    private Statement statement;
    private PreparedStatement pStatement;
    private ResultSet dataStore;

    private String HOST = "jdbc:derby://localhost:1527/EverAccount";
    private String USERNAME = "root";
    private String PASSWORD = "qwertypad";

    public DBConnection() throws SQLException {
        connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    public void executeCommand(String sql, boolean isUpdate) throws SQLException {
        if (isUpdate) {
            statement.executeUpdate(sql);
        } else {
            dataStore = statement.executeQuery(sql);
        }

    } 
    
    public void executeCommand(PreparedStatement pStatement, boolean isUpdate) throws SQLException {
        if (isUpdate) {
            pStatement.executeUpdate();
        } else {
            dataStore = pStatement.executeQuery();
        }

    } 

    public ResultSet getData() {
        return this.dataStore;
    }
    
    public PreparedStatement prepareStatement(String sql) throws SQLException{
        return pStatement = connection.prepareStatement(sql);
    }

}
