package ch10.ex12_member;

/**
 * NotExistIdException - ID�� Ʋ�� ��� �߻���Ű�� ����
 */
public class NotExistIdException extends RuntimeException {
	NotExistIdException() {}
	
	NotExistIdException(String message) {
		super(message);
	}
}
