package rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class AddServer {
    public static void main(String[] args) {
        try{
            AddServerImpl addServer = new AddServerImpl();
            Naming.rebind("AddServer", addServer);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
