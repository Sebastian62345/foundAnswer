package testSupportFunction;


public class RandNumber {
	
	int randedNumber;
	int min = 1; // Minimum value of range
	int max = 100; // Maximum value of range
	public RandNumber(){
		
		randedNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);
		
	}
	public int getRandedNumber(){
		return this.randedNumber;
	}
	
}
