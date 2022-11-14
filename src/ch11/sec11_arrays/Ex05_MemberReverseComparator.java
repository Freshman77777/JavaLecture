package ch11.sec11_arrays;

import java.util.Comparator;

public class Ex05_MemberReverseComparator implements Comparator<Ex05_Member> {

	@Override
	public int compare(Ex05_Member o1, Ex05_Member o2) {
		return o2.name.compareTo(o1.name);
	}
}
