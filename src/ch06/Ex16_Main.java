package ch06;

/**
 * ��Ǯ�� ����(22.10.28)
 */
public class Ex16_Main {

	public static void main(String[] args) {
		Ex16_Product prod1 = new Ex16_Product(101,"��Ʈ��",1200000,"��ǻ��");
		Ex16_Product prod2 = new Ex16_Product(102,"����ũž",1000000,"��ǻ��");
		Ex16_Product prod3 = new Ex16_Product(103,"�����",200000,"��ǻ��");
		Ex16_Product prod4 = new Ex16_Product(104,"TV",1500000,"����");
		Ex16_Product prod5 = new Ex16_Product(105,"��ǳ��",50000,"����");
		System.out.println(prod1);
		
		String[] productNames = {"��Ʈ��","����ũž","�����","TV","��ǳ��"};
		int[] productPrices = {1200000,1000000,200000,1500000,50000};
		String[] productCategroies = {"��ǻ��","��ǻ��","��ǻ��","����","����"};
		Ex16_Product[] products = new Ex16_Product[5];
		for (int i=0; i<products.length; i++) {
			products[i] = new Ex16_Product(101+i, productNames[i], productPrices[i], productCategroies[i]);
		}
		for (Ex16_Product product : products)
			System.out.println(product);
	}

}
