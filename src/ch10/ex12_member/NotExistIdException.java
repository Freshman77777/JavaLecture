package ch10.ex12_member;

/**
 * NotExistIdException - ID가 틀린 경우 발생시키는 예외
 */
public class NotExistIdException extends RuntimeException {
	NotExistIdException() {}
	
	NotExistIdException(String message) {
		super(message);
	}
}
