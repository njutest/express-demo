package edu.nju.expressMgmtSys.client;

import edu.nju.expressMgmtSys.util.RMIHelper;
import edu.nju.expressMgmtSys.presentation.ClientFrame;

public class Client {

    public static void main(String[] args) {
        RMIHelper.init();

        new ClientFrame();
    }
}
