/*
 * ClientInfoController class 
    is represent controling ClientInfoDaoImpl 
 */
package chat.server.controller;

import chat.server.service.dao.impl.ClientInfoDaoImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ElGazzar
 */
public class ClientInfoController 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ClientInfoDaoImpl db = new ClientInfoDaoImpl();
            Registry reg = LocateRegistry.createRegistry(1111);
            reg.rebind("Service", db);
            
            System.out.println("Server Done .....");
            
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
    
}
