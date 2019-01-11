package main;


import java.util.logging.Level;
import java.util.logging.Logger;


public class test {
public static void main(String[] args) {
	Logger logger = Logger.getLogger(test.class.getName());;
	logger.setLevel(Level.INFO);
	logger.info("---------------------------------------------");
	logger.info("               Test Programm ");
	logger.info("---------------------------------------------");
	 int limit = 100;
     int zahl;      // Zu überprüfende Zahl
     int zaehler;   // Hilfsvariable (möglicher Teiler von zahl)
     boolean primzahl; // Hilfsvariable, ob die aktuelle Zahl eine Primzahl ist

     // zahl <= x   ist der zu überprüfende Zahlenraum
     // Beginn bei 2, weil 1 per Definition keine Primzahl ist
     for (zahl = 2; zahl <= limit; zahl++) {
         // solange wir für zahl keinen Teiler finden, gehen wir davon aus,
         // dass es eine Primzahl ist
         primzahl = true;

         // zaehler ist ein möglicher Teiler. Mögliche nicht-triviale Teiler
         // liegen im Bereich 2 bis zahl/2 (abgerundet), wenn x aber Teiler
         // von Zahl und größer als Wurzel(zahl), ist zahl/x < Wurzel(zahl), 
         // sodass diese Grenze genügt.
         for (zaehler = 2; zaehler < Math.sqrt(zahl) + 1; zaehler++) {
             if (zahl % zaehler == 0) {
                 // zaehler ist ein nichttrivialer Teiler von zahl und damit
                 // zahl keine Primzahl. Weitere Teiler müssen nicht geprüft
                 // werden und damit kann die Schleife abgebrochen werden.
                 primzahl = false;
                 break;
             }


         }

         if (primzahl) {
             // Keine Teiler gefunden -> zahl2 ist eine Primzahl
             System.out.println(zahl+" ist eine Primzahl");
         }
     }
 }
}

