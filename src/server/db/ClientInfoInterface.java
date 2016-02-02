/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.db;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author ElGazzar
 */
public interface ClientInfoInterface extends Remote{
    
    public boolean validEmail(String email) throws RemoteException;
    public boolean insert(ClientInfo c) throws RemoteException;
    public boolean update(ClientInfo c) throws RemoteException;
    public boolean delete(ClientInfo c) throws RemoteException;
   // public void deleteAll() throws RemoteException;
    public ArrayList selectAll() throws RemoteException;
    public ArrayList findByID(int idSearch) throws RemoteException;
    
}
