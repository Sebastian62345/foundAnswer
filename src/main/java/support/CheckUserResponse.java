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
		Scanner getUserAnswerN = new Scanner(System.in);
		char result = 'X';
		int userNum;
		int uResponse = 0;
		if(questionType == 'N') {
			int randedVal = oN.getRandedVal();
			
			System.out.print("Podaj liczbę o której Twoim zdaniem myślę: ");
			while(true) {
				uResponse = getUserAnswerN.nextInt();
				if(uResponse == 0) {
					System.out.println("Wybrano zero - program zostanie zakończony");
					System.exit(0); 
				}else if (uResponse > oN.getRandedVal()) {
					System.out.println("Liczba o ktorej myślę jest mniejsza zgaduj dalej: ");
				} else if (uResponse < oN.getRandedVal()) {
					System.out.println("Liczba o ktorej myślę jest większa zgaduj dalej: ");
				} else if (uResponse ==  oN.getRandedVal()) {
					System.out.println("Brawo zgadłeś");
					break;
				}
				//System.out.println("Wpisales " + uResponse);
				
			}
		}
		
		if(questionType == 'L') {
			System.out.print("Podaj literę o której Twoim zdaniem myślę: ");
			Scanner getUserAnswerS = new Scanner(System.in);
			System.out.println("Wpisales " + uResponse);
			
		}
	}
}
