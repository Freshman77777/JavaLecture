package ch13_generic.q04;

public class Util {
	// 다형성 이용
//	public static <K, V> V getValue(Pair<K, V> p, K k) {
//		if (p.getKey().equals(k)) {
//			return p.getValue();
//		} else {
//			return null;
//		}
//	}
	
	// Restricted 이용
	public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
		if (p.getKey().equals(k)) {
			return p.getValue();
		} else {
			return null;
		}		
	}
}
