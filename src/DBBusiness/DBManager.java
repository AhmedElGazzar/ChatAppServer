/*
    DBManager to connect to MySQL database 
 */
package DBBusiness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ElGazzar
 */
public class DBManager 
{
    private static DBManager _instance = null;
    private Connection _con = null;
    
    public DBManager()
    {
        
    }

    //Thread safe instatiate method
    public static synchronized DBManager getInstance() {
        if(_instance == null)
        {
            _instance = new DBManager();
        }
        return _instance;
    }

    public Connection getCon() {
        return _con;
    }
    
    /**
   * Connection to MySQL Database
   */
    private static Connection getMySQLConnection()
    {
        Connection con = null;
        try {
 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatapp", "root", "root");
   
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Can't Connect To Database !!", "DB Error !!", JOptionPane.ERROR_MESSAGE, null);
            se.printStackTrace();
            }
        return con;
    }
    
    
        public void closeConnection(Connection con, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Can't close Database Connection !!", "DB Error !!", JOptionPane.ERROR_MESSAGE, null);
        }
    }
}
