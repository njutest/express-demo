package edu.nju.express.init;

public class Server {

    public static void main(String[] args) {
        RMIHelper.init();
        System.out.println("Server started!");
    }
}
