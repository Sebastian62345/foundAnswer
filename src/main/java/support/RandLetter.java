package support;

public class RandLetter  {
	byte min = 65; // Minimum value of range
	byte max = 90; // Maximum value of range
	byte asciCodeDec;
	char randedLetter;
	
	
	
	public RandLetter() {
		asciCodeDec = (byte)Math.floor(Math.random() * (max - min + 1) + min);
		randedLetter = new Character((char) asciCodeDec);
	}
	
	/**
	 * getRandedVal zwraca wylosowaną litere
	 * @param Metoda nie ma parametru wejsciowego
	 * @return Metoda zwraca litere ktora zostala wygenerowana przy tworzeniu obiektu na podstawie klasy RandLetter
	*/
	
	public char getRandedVal(){
		return this.randedLetter;
	}
	
}
