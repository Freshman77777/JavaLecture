package ch10.ex12_member;

public class WrongPasswordException extends RuntimeException {
	WrongPasswordException() {}
	
	WrongPasswordException(String message) {
		super(message);
	}
}
