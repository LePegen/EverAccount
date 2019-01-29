package database;

import database.DBConnection;

/**
 *
 * @author Gene Garcia
 */
public class DataObject {
      protected  DBConnection connection;
    
    public DataObject(DBConnection connection) {
        this.connection = connection;
       
    }
    
    
}
