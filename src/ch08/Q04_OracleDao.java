package ch08;

/**
 * Oracle Data Access Object
 */
public class Q04_OracleDao implements Q04_DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
	}
}
