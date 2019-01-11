package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class test {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(test.class.getName());
		;
		logger.setLevel(Level.INFO);
		logger.info("---------------------------------------------");
		logger.info("               Test Programm ");
		logger.info("---------------------------------------------");
		int limit = 9999;
		int zahl;
		int zaehler;
		boolean primzahl;

		for (zahl = 2; zahl <= limit; zahl++) {
			primzahl = true;
			for (zaehler = 2; zaehler < Math.sqrt(zahl) + 1; zaehler++) {
				if (zahl % zaehler == 0) {
					primzahl = false;
					break;
				}
			}
			if (primzahl) {
				System.out.println(zahl + " ist eine Primzahl");
			}
		}
	}
}
