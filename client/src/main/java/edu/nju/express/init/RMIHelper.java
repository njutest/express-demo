package edu.nju.express.init;

import edu.nju.express.businesslogic.OrderBL;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIHelper {
    private static final String IP = "localhost";//Can be read from config file
    private static OrderBL orderBL;

    public static void init() {
        try {
            orderBL =  (OrderBL) Naming.lookup("rmi://" + IP + "/order-businesslogic");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }

    public static OrderBL getOrderBL() {
        return orderBL;
    }
}
