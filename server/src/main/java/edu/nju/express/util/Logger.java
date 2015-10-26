package edu.nju.express.util;

public class Logger {

	public static void info(String msg){
		System.out.println("INFO - "+msg);
	}
	
	public static void exception(Throwable e){
		e.printStackTrace(System.out);
	}

	public static void error(String msg) {
		System.out.println("ERROR - "+msg);
	}
	
}
