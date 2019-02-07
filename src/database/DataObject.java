package database;

import database.DBConnection;
import java.sql.PreparedStatement;

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
