package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03_Pipelined {
	
	public static void main(String[] args) {
		List<Ex03_Student> list = new ArrayList<>();
		list.add(new Ex03_Student("ȫ�浿",10));
		list.add(new Ex03_Student("���ڹ�",20));
		list.add(new Ex03_Student("�ڰ�ü",30));
		
		// ����� ���ϰ��� ��
		//��� 1
		Stream stream = list.stream();
		IntStream scoreStream = stream.mapToInt(s -> s.getScore());
		double avg = scoreStream.average().getAsDouble();
		System.out.println("��� ����:" + avg);
		
		//��� 2
		avg = list.stream()
				.mapToInt(s -> s.getScore())  //�߰� ó��
				.average()					  //���� ó��
				.getAsDouble();               //���� ó��(Ÿ�� ����)
		System.out.println("��� ����:" +avg);
		
	}

}
