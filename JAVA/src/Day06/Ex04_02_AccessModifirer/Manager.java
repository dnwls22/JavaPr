package Day06.Ex04_02_AccessModifirer;

import Day06.Ex04_01_AccessModifirer.Person;

public class Manager {
	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.getAge());
		// Manager 에서 Student 의 default 접근지정자 변수인 height 를 접근할 수 없는 이유
		// - 같은패키지에 있지만 , 실질적으로 height 를 선언 한 곳은
		// 다른 패키지인 person 에서 선언을 했기 때문에 접근불가
		// *선언한 클래스를 기준으로 접근지정자가 적용된다.
		System.out.println("Height : " + student.getHeight());
		System.out.println("Weight : " + student.getWeight());
		System.out.println();
		
		Person person = new Person("김조은", 20, 170, 60);
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.getAge());
		System.out.println("Height : " + person.getHeight());
		System.out.println("Weight : " + person.getWeight());
		System.out.println();
	}

}
