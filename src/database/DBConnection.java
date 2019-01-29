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
    
    private String HOST = "";
    private String USERNAME = "";
    private String PASSWORD = "";
    
    private final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
    private final String JDBCURL="jdbc:derby:derbyDB;create=true";
    
    public DBConnection(){
        try {
            initConnection();
            initDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void initConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        this.connection = DriverManager.getConnection(JDBCURL);
        Class.forName(DRIVER).newInstance();
    }
    
    public void initDatabase() throws SQLException{
        String command=
                  "CREATE TABLE ACCOUNTS("
                + "AccountID VARCHAR(100),"
                + "UniqueName VARCHAR(100),"
                + "Provider VARCHAR(100),"
                + "Email VARCHAR(100),"
                + "Username VARCHAR(100),"
                + "Password VARCHAR(100),"
                + "AdditionalInfomation VARCHAR(100)"
                + ")";
        //this.connection.createStatement().execute(command);
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
