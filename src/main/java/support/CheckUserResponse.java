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
		if(questionType == 'N') {
			System.out.print("podaj liczbę o której Twoim zdaniem myślę: ")
		}
	}
}
