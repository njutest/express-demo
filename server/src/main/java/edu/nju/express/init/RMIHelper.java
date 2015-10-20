package edu.nju.express.init;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import edu.nju.express.businesslogic.OrderBL;
import edu.nju.express.businesslogic.impl.OrderBLImpl;

public class RMIHelper {

    public static void init() {
        try {
            LocateRegistry.createRegistry(1099);

            OrderBL orderBL = new OrderBLImpl();

            Naming.rebind("order-businesslogic", orderBL);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }


    }
}
