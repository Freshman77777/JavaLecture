package ch10Ex11_userDefineException;

public class BalanceInsufficientExeption extends RuntimeException {
	BalanceInsufficientException() { }

	BalanceInsufficientException(String message) {
		super(message)
}
}
