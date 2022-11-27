package db_과제2_이동제;             // 1.2 Employee 클래스가 정상적으로 동작하기 위한 EmployeeMain 클래스 작성

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
				
		set.add(new Employee(133,"강자바","부장",LocalDate.of(2000, 8, 01)));      //1.2-1 HashSet에 다음의 5명을 입력하고 그 결과를 출력한다
		set.add(new Employee(143,"은전기","차장",LocalDate.of(2003, 1, 01)));
		set.add(new Employee(163,"노전자","과장",LocalDate.of(2018, 8, 01)));
		set.add(new Employee(173,"권표준","대리",LocalDate.of(2022, 1, 01)));
		set.add(new Employee(213,"홍정부","사원",LocalDate.of(2019, 1, 01)));
		set.forEach(h -> System.out.println(h));
		System.out.println();
		
		set.add(new Employee(123,"권표준","대리",LocalDate.of(1998, 1, 01)));     // 1.2-2 다음의 두명을 HashSet에 추가한 후 모든 종업원을 출력한다.
		set.add(new Employee(163,"노전자","사원",LocalDate.of(2008, 8, 01)));
		
		set.forEach(h -> System.out.println(h));
		System.out.println();

	}
		}

	


