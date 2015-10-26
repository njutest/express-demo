package edu.nju.express.init;

import edu.nju.express.presentation.ClientFrame;

public class Client {

    public static void main(String[] args) {
        RMIHelper.init();

        new ClientFrame();
    }
}
