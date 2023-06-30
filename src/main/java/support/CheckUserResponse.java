package support;

public class CheckUserResponse {
	
	String userResponse;
	private char questionType;
	
	public CheckUserResponse(RandNumber v){
		this.questionType = 'N';
	}
	
	public CheckUserResponse(RandLetter v){
		this.questionType = 'L';
	}

	public char interactionWithUser() {
		char result = 'X';
		if(questionType == 'N') {
			System.out.print("Podaj liczbę o której Twoim zdaniem myślę: ");
			result = 'Z';
		}
		
		if(questionType == 'L') {
			System.out.print("Podaj literę o której Twoim zdaniem myślę: ");
			result =  'Z';
		}
		return result;
	}
}
