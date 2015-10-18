package edu.nju.expressMgmtSys.server;

import edu.nju.expressMgmtSys.util.RMIHelper;

public class Server {

    public static void main(String[] args) {
        RMIHelper.init();
        System.out.println("Server started!");
    }
}
