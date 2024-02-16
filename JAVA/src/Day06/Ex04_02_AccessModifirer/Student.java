package Day06.Ex04_02_AccessModifirer;

import Day06.Ex04_01_AccessModifirer.Person;

public class Student extends Person {

//생성자 
	public Student() {
		super();
		
	}
		
	
	
	//매개변수 생성자
	public Student(String name, int age, int height, int weight ) {
		
	super(name, age, height, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음";  // public접근지정자로, 모든 곳에서 접근 가능	
		age  = 20;       // protected 접근 지정자로 person상속받았기 떄문에 다른 패키지라도 접근가능		
		//height = 150;       //default 접근지정자로 같은 패키지에서만 접근가능		
		//weight = 40;       //private 접근지정자로 해당클래스에서만 접근가능
		setHeight(150);
		setWeight(40);
	}
}
