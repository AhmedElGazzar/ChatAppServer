/*
    ClientInfoImpl to implement all abstract methods from ClientInfoInterface
 */
package DBBusiness;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import server.db.ClientInfo;
import server.db.ClientInfoInterface;

/**
 *
 * @author ElGazzar
 */
public class DBHandler extends UnicastRemoteObject implements ClientInfoInterface{

    DBManager dbConnection = null;
    public DBHandler() throws RemoteException
    {
    }
    
        Connection conn;
        Statement stm;
        ResultSet results;
        PreparedStatement pstm;
    
    @Override
    public boolean validEmail(String email) {

        try {
            conn = DBManager.getInstance().getCon();
            stm = conn.createStatement();
            String validSQL = "SELECT * FROM ClientInfo WHERE EMAIL = '"+email+"'";
            results = stm.executeQuery(validSQL);
            
            if (results.next()) {
                return true;
            } else {
                return false;
            }    
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Email !!", "DB Error!!", JOptionPane.ERROR_MESSAGE, null);
            return false;
        }
        finally {
            dbConnection.closeConnection(conn, stm, results);
        }
     
    }
    
    @Override
    public boolean insert(ClientInfo c){
        
        if(!validEmail(c.getEmail()))
        {
            try{
                conn = DBManager.getInstance().getCon();
                stm = conn.createStatement();
                String sql= "INSERT INTO ClientInfo(FIRST_NAME,LAST_NAME,USER_NAME,EMAIL,PASSWORD,TELEPHONE,ADDRESS,"
                        + "CREATION_DATE,LAST_LOGIN, PROFILE_IMG,GENDER,COUNTRY,STATUS,TXT_STATUS,DELETED,URL,PORT)"
                       // + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                + "VALUES(ahmed,elgazzar,gazzar,eng.gazzar.fcih@gmail.com,12345,01092696926,cairo,29/01/2016,29/01/2016,img,1,egypt,1,hello,0,ip,port)";
                
                results = stm.executeQuery(sql);
                
                if (results.next()) {
                return true;
            } else {
                return false;
            }    
               /* 
                pstm = conn.prepareStatement(sql);

                pstm.setString(1, c.getfName());
                pstm.setString(2, c.getlName());
                pstm.setString(3, c.getUserName());
                pstm.setString(4, c.getEmail());
                pstm.setString(5, c.getPassword());
                pstm.setInt(6, c.getTelephone());
                pstm.setString(7, c.getAddress());
                pstm.setDate(8, (Date) c.getCreationDate());
                pstm.setDate(9, (Date) c.getLastLogin());
                pstm.setBlob(10, (Blob) c.getProfileImage());
                pstm.setString(11, c.getGender());
                pstm.setString(12, c.getCountry());
                pstm.setString(13, c.getStatus());
                pstm.setString(14, c.getTxtstatus());
                pstm.setBoolean(15, c.isDeleted());
                pstm.setString(16, c.getIp());
                pstm.setString(17, c.getPort());

                pstm.executeUpdate();
*/
            }
            catch(SQLException se)
            {
                se.printStackTrace();
                JOptionPane.showMessageDialog(null, "Can't register new client in the database !!", "DB Error!!", JOptionPane.ERROR_MESSAGE, null);

            }
            finally {

                    dbConnection.closeConnection(conn, pstm, results);
            }
        }
        else{
        return false;
        }
        return true;
    }

    @Override
    public boolean update(ClientInfo c){
        if(!validEmail(c.getEmail()))
        {
            try{
                conn = DBManager.getInstance().getCon();
              //  stm = conn.createStatement();
                String sql= "UPDATE ClientInfo SET FIRST_NAME=? AND LAST_NAME=? AND USER_NAME=? AND PASSWORD=? TELEPHONE=? "
                        + "AND ADDRESS=? AND PROFILE_IMG=? AND GENDER=? AND COUNTRY=? WHERE ID='"+c.getID()+"'";
               
              //  results = stm.executeQuery(sql);
                
             /*   if (results.next()) {
                return true;
            } else {
                return false;
            }  */  
                
                pstm = conn.prepareStatement(sql);

                pstm.setString(1, c.getfName());
                pstm.setString(2, c.getlName());
                pstm.setString(3, c.getUserName());
                pstm.setString(4, c.getPassword());
                pstm.setInt(5, c.getTelephone());
                pstm.setString(6, c.getAddress());
                pstm.setBlob(7, (Blob) c.getProfileImage());
                pstm.setString(8, c.getGender());
                pstm.setString(9, c.getCountry());

                pstm.executeUpdate();

            }
            catch(SQLException se)
            {
                se.printStackTrace();
                JOptionPane.showMessageDialog(null, "Can't register new client in the database !!", "DB Error!!", JOptionPane.ERROR_MESSAGE, null);

            }
            finally {

                    dbConnection.closeConnection(conn, pstm, results);
            }
        }
        else{
        return false;
        }
        return true;    
    }

    @Override
    public boolean delete(ClientInfo c) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList selectAll() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList findByID(int idSearch) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
