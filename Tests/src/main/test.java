package main;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class test {
public static void main(String[] args) {
	Logger logger = Logger.getLogger(test.class.getName());;
	logger.setLevel(Level.ALL);
	ConsoleHandler handler = new ConsoleHandler();
	handler.setFormatter(new SimpleFormatter());
	logger.addHandler(handler);
	logger.info("Hello World!");



}
}
