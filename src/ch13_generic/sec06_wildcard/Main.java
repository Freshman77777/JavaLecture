package ch13_generic.sec06_wildcard;

import java.util.Arrays;

public class Main {
	// Person, Worker, Student, HighStudent ��� ���� ����
	public static void registerCourse(Course<?> course) {	
		System.out.println(course.getName() + "������: " +
							Arrays.toString(course.getStudents()));
	}
	// Student, HighStudent �� ���� ����
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "������: " +
							Arrays.toString(course.getStudents()));
	}
	// Person, Worker �� ���� ����
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "������: " +
							Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<> ("�Ϲ��� ����, ", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<> ("������ ����, ", 5);
//		workerCourse.add(new Person("�Ϲ���"));
		workerCourse.add(new Worker("������"));
//		workerCourse.add(new Student("�л�"));
//		workerCourse.add(new HighStudent("����л�"));
		
		Course<Student> studentCourse = new Course<> ("�л� ����, ", 5);
//		studentCourse.add(new Person("�Ϲ���"));
//		studentCourse.add(new Worker("������"));
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<> ("����л� ����, ", 5);
//		highStudentCourse.add(new Person("�Ϲ���"));
//		highStudentCourse.add(new Worker("������"));
//		highStudentCourse.add(new Student("�л�"));
		highStudentCourse.add(new HighStudent("����л�"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
	}

}

