package rmi.client;

import rmi.AddServerIntf;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AddClient {
    public static void main(String[] args) {
        String addServerUrl = "rmi://"+args[0] + "/AddServer";
        double d1 = Double.parseDouble(args[1]);
        double d2 = Double.parseDouble(args[2]);
        try {
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerUrl);
            addServerIntf.add(d1,d2);
            System.out.println(String.format("Value1=%f Value2=%f",d1,d2));
            System.out.println("Sum: ");
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
