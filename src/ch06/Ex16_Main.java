package ch06;

/**
 * 몸풀기 문제(22.10.28)
 */
public class Ex16_Main {

	public static void main(String[] args) {
		Ex16_Product prod1 = new Ex16_Product(101,"노트북",1200000,"컴퓨터");
		Ex16_Product prod2 = new Ex16_Product(102,"데스크탑",1000000,"컴퓨터");
		Ex16_Product prod3 = new Ex16_Product(103,"모니터",200000,"컴퓨터");
		Ex16_Product prod4 = new Ex16_Product(104,"TV",1500000,"가전");
		Ex16_Product prod5 = new Ex16_Product(105,"선풍기",50000,"가전");
		System.out.println(prod1);
		
		String[] productNames = {"노트북","데스크탑","모니터","TV","선풍기"};
		int[] productPrices = {1200000,1000000,200000,1500000,50000};
		String[] productCategroies = {"컴퓨터","컴퓨터","컴퓨터","가전","가전"};
		Ex16_Product[] products = new Ex16_Product[5];
		for (int i=0; i<products.length; i++) {
			products[i] = new Ex16_Product(101+i, productNames[i], productPrices[i], productCategroies[i]);
		}
		for (Ex16_Product product : products)
			System.out.println(product);
	}

}
