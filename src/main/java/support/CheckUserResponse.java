package support;
import java.util.*;
public class CheckUserResponse {
	
	private char questionType;
	private RandNumber oN;
	private RandLetter oL;
	
	
	public CheckUserResponse(RandNumber v){
		this.oN = v;
		this.questionType = 'N';
	}
	
	public CheckUserResponse(RandLetter v){
		this.oL = v;
		this.questionType = 'L';
	}

	public void interactionWithUser() {
		Scanner getUserAnswer = new Scanner(System.in);
		int userNum;
		int uResponseInt;
		char uResponseChr ='0';
		if(questionType == 'N') {
			int randedVal = oN.getRandedVal();
			
			System.out.print("Podaj liczbę o której Twoim zdaniem myślę: ");
			while(true) {
				uResponseInt = getUserAnswer.nextInt();
				if(uResponseInt == 0) {
					System.out.println("Wybrano zero - program zostanie zakończony");
					System.exit(0); 
				}else if (uResponseInt > oN.getRandedVal()) {
					System.out.println("Liczba o ktorej myślę 1jest mniejsza zgaduj dalej: ");
				} else if (uResponseInt < oN.getRandedVal()) {
					System.out.println("Liczba o ktorej myślę jest większa zgaduj dalej: ");
				} else if (uResponseInt ==  oN.getRandedVal()) {
					System.out.println("Brawo zgadłeś");
					break;
				}
				//System.out.println("Wpisales " + uResponse);
				
			}
		}
		
		if(questionType == 'L') {
			System.out.print("Podaj literę o której Twoim zdaniem myślę: ");
			Scanner getUserAnswerC = new Scanner(System.in);
			//System.out.println("Wylosowana " +  oL.getRandedVal());
			while(true) {
				uResponseChr = getUserAnswer.next().charAt(0);
				uResponseChr = Character.toUpperCase(uResponseChr);
				if(uResponseChr == '0') {
					System.out.println("Wybrano zero - program zostanie zakończony");
					System.exit(0); 
				} else if (uResponseChr > oL.getRandedVal()) {
					System.out.println("Liczba o ktorej myślę jest przed wpisaną liczbą w alfabecie zgaduj dalej: ");
				} else if (uResponseChr < oL.getRandedVal()) {
					System.out.println("Liczba o ktorej myślę  jest za wpisaną liczbą w alfabecie zgaduj dalej: ");
				} else if (uResponseChr ==  oL.getRandedVal()) {
					System.out.println("Brawo zgadłeś");
					break;
				}
			}
		}
	}
}
