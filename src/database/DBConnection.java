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
    
    private String HOST = "jdbc:derby://localhost:1527/LeznedEveraccount";
    private String USERNAME = "Lezned";
    private String PASSWORD = "denzel";
    
    public DBConnection() throws SQLException{
        connection=DriverManager.getConnection(HOST,USERNAME,PASSWORD);
        statement=connection.createStatement();
    }
    
    /**
     * figure out if the sql command will be a parameter or will be
     * global variable. For the meantime, overloaded method
     */
    public void executeCommand() throws SQLException{
        this.dataStore = statement.executeQuery(this.commandSQL);
    }
    
    public void executeCommand(String sql) throws SQLException{
        this.dataStore = statement.executeQuery(sql);
    }
    
    public void setSQLCommand(String sqlCom){
        this.commandSQL = sqlCom;
    }
    
    public ResultSet getData(){
        return this.dataStore;
    }
    
    public void openConnection(){
        
    }
    
    public void closeConnection(){
        
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
