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

    private String commandSQL;

    private String HOST = "jdbc:derby://localhost:1527/EverAccount";
    private String USERNAME = "root";
    private String PASSWORD = "qwertypad";

    public DBConnection() throws SQLException {
        connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    /**
     * to handle java.sql.SQLException: executeQuery method can not be used for update.
     * @throws SQLException 
     */
    public void startNewConnection() throws SQLException {
        
        
        connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        statement = connection.createStatement();
    }

    /**
     * figure out if the sql command will be a parameter or will be global
     * variable. For the meantime, overloaded method
     */
    public void executeCommand() throws SQLException {
        this.dataStore = statement.executeQuery(this.commandSQL);
    }

    public void executeCommand(String sql) throws SQLException {
        this.dataStore = statement.executeQuery(sql);
    }
    
    public void executeCommand(String sql,boolean isUpdate)throws SQLException{
        if(isUpdate){
            statement.executeUpdate(sql);
        }else{
            statement.execute(sql);
       }
       
    }

    public void setSQLCommand(String sqlCom) {
        this.commandSQL = sqlCom;
    }

    public ResultSet getData() {
        return this.dataStore;
    }

    public void openConnection() {

    }

    public void closeConnection() {

    }

    public String getHOST() {
        return HOST;
    }

    public void setHOST(String HOST) {
        this.HOST = HOST;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

}
