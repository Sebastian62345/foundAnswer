package support;

public class CheckUserResponse {
	
	String userResponse;
	char questionType;
	
	public CheckUserResponse(RandNumber v){
		this.questionType = 'N';
	
	public CheckUserResponse(RandLetter v){
		this.questionType = 'L';
	}

	
}
