
package in.codebros.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector 
{
    Connection connect;
    DbData data;
    public Connector() 
    {
        data = new DbData();
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(data.getURL(),data.getUSER(),data.getPASS());
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
