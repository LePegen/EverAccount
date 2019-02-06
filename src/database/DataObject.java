package database;

import database.DBConnection;

/**
 *
 * @author Lezned
 */
public class DataObject {

    protected DBConnection connection;

    public DataObject(DBConnection connection) {
        this.connection = connection;

    }

}
