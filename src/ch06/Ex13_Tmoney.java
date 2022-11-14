package ch06;

/*
 * Tmoney card
 * 
 *  - 10000�� ī�� ����
 *  - 1ȸ�� 1350�� ���� ����
 *  - �ݾ��� -�� �Ǹ� �ȵȴ�. �ܾ��� 1000���̶�� �ϸ� ����� �� ����
 *  - �ݾ��� �������ؾ� �Ѵ�.
 */
public class Ex13_Tmoney {

	public static void main(String[] args) {
		Tmoney card = new Tmoney(10000);
		while (true) {
			if (!card.ride())
				break;
			System.out.println(card.cash);
		}
		card.charge(10000);
		while (true) {
			if (!card.ride())
				break;
			System.out.println(card.cash);
		}
	}

}

class Tmoney {
	int cash;
	
	Tmoney(int cash) {
		this.cash = cash;
	}
	boolean ride() {
		if (this.cash >= 1350) {
			this.cash -= 1350;
			return true;
		}
		return false;	
	}
	void charge(int cash) {
		this.cash += cash;
	}
}
	

