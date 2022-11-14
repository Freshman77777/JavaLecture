package ch15_collection.advanced;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> ts = new TreeSet<>();
        ts.add(new Employee(123, "���ڹ�", Position.����, LocalDate.of(1998, 1, 1)));
        ts.add(new Employee(133, "���ڹ�", Position.����, LocalDate.of(2000, 8, 1)));
        ts.add(new Employee(143, "������", Position.����, LocalDate.of(2003, 1, 1)));
        ts.add(new Employee(163, "�̸���", Position.����, LocalDate.of(2009, 10, 1)));
        ts.add(new Employee(153, "������", Position.����, LocalDate.of(2008, 1, 1)));
        ts.add(new Employee(203, "������", Position.����, LocalDate.of(2018, 8, 11)));
        ts.add(new Employee(173, "��ǥ��", Position.�븮, LocalDate.of(2022, 1, 1)));
        ts.add(new Employee(193, "��ǥ��", Position.�븮, LocalDate.of(2017, 4, 1)));
        ts.add(new Employee(183, "õ���", Position.���, LocalDate.of(2016, 1, 1)));
        ts.add(new Employee(213, "ȫ����", Position.���, LocalDate.of(2019, 1, 1)));
        
        // ���� ������ �����?
        ts.add(new Employee(513, "������", Position.���, LocalDate.of(2019, 1, 1)));
        ts.add(new Employee(153, "������", Position.����, LocalDate.of(2010, 1, 1)));
        
        for (Employee emp: ts)
        	System.out.println(emp);
        System.out.println();
        
        Set<Employee> hs = new HashSet<>();
        hs.add(new Employee(123, "���ڹ�", Position.����, LocalDate.of(1998, 1, 1)));
        hs.add(new Employee(133, "���ڹ�", Position.����, LocalDate.of(2000, 8, 1)));
        hs.add(new Employee(143, "������", Position.����, LocalDate.of(2003, 1, 1)));
        hs.add(new Employee(163, "�̸���", Position.����, LocalDate.of(2009, 10, 1)));
        hs.add(new Employee(153, "������", Position.����, LocalDate.of(2008, 1, 1)));
        hs.add(new Employee(203, "������", Position.����, LocalDate.of(2018, 8, 11)));
        hs.add(new Employee(173, "��ǥ��", Position.�븮, LocalDate.of(2022, 1, 1)));
        hs.add(new Employee(193, "��ǥ��", Position.�븮, LocalDate.of(2017, 4, 1)));
        hs.add(new Employee(183, "õ���", Position.���, LocalDate.of(2016, 1, 1)));
        hs.add(new Employee(213, "ȫ����", Position.���, LocalDate.of(2019, 1, 1)));
        
        // ���� ������ �����?
        hs.add(new Employee(513, "������", Position.���, LocalDate.of(2019, 1, 1)));
        hs.add(new Employee(153, "������", Position.����, LocalDate.of(2010, 1, 1)));
        
        for (Employee emp: hs)
        	System.out.println(emp);
        System.out.println();
        
        // Stream�� �̿��ϸ� ������ ������ �� ����(�Ի����� ����)
        hs.stream()
          .sorted((o1, o2) -> o1.getJoinDate().compareTo(o2.getJoinDate()))
          .forEach(s -> System.out.println(s));
	}

}