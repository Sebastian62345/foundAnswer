package support;

public class RandLetter  {
	byte min = 65; // Minimum value of range
	byte max = 90; // Maximum value of range
	byte asciCodeDec;
	String randedLetter;
	public RandLetter() {
		asciCodeDec = (byte)Math.floor(Math.random() * (max - min + 1) + min);
		randedLetter = new Character((char) asciCodeDec).toString();
	}
	
	public String getRandedVal(){
		return this.randedLetter;
	}
	
}
