package support;
import org.apache.log4j.Logger;

public class RandNumber {
	Logger LObj = Logger.getLogger(RandNumber.class);
	int randedNumber;
	int min = 1; // Minimum value of range
	int max = 100; // Maximum value of range
	public RandNumber(){
		
		randedNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);
		LObj.info("Wylosowana liczba " + randedNumber);
	}
	
	/**
	 * getRandedVal zwraca wylosowaną liczbbe
	 * @param Metoda nie ma parametru wejsciowego
	 * @return Metoda zwraca litere ktora zostala wygenerowana przy tworzeniu obiektu na podstawie klasy RandLetter
	*/
	
	public int getRandedVal(){
		return this.randedNumber;
	}
	
}
