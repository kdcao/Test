package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class test {
public static void main(String[] args) {
	Logger logger = Logger.getLogger(test.class.getName());;
	logger.setLevel(Level.INFO);
	logger.info("---------------------------------------------");
	logger.info("               Test Programm ");
	logger.info("---------------------------------------------");
	Scanner scan = new Scanner(System.in);
	System.out.print("User: ");
	String test = scan.next();
	System.out.println("your username is "+test);
}
}
