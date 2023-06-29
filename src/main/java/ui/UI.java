package ui;
import org.apache.log4j.Logger;
import java.util.*;
import support.*;

public class UI {
	
	static Logger LObj = Logger.getLogger(UI.class);
	public static void main(String[] args) {
		String choice;
		//LObj.debug("Start Game");
		System.out.println("Witaj w grze która polega na odgadnięciu litery albo cyfry która wylosuje:");
		System.out.println("Wpisz cyfre 1 jeśli chcesz zgadnąć jaką liczbę wylosowałem z zakresu 0 - 100.");
		System.out.println("Wpisz literę A jeśli chcesz zgadnąć jaką litere wylosowałem z zakresu A - Z.");
		System.out.println("Wpisz literę X jesli chcesz zakończyć program.");
		Scanner gud = new Scanner(System.in);
		while(true) {
			System.out.print("Wwój wybór to: ");
			choice = gud.nextLine();
			if(choice.equals("X") || choice.equals("x") ) {
				System.out.println("Program zostanie zakończony wybrano X");
				break;
			} else if (choice.equals("1") ) {
				LObj.info("Wybrano losowanie liczby");
				RandNumber oRandNum = new RandNumber();
				System.out.println("Wylosowano liczbe " + oRandNum.getRandedNumber() );
			} else if (choice.equals("A") || choice.equals("a")) {
				LObj.info("Wybrano losowanie litery");
			} else {
				LObj.info("Zła Opcja");
			}
			
		}
		//LObj.info("Finish Game");
		System.exit(0); 
	}
		
}
