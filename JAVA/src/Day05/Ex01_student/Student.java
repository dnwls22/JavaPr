package Day05.Ex01_student;

public class Student {
	// 학생의 속성 : 이름 나이 학번 전공
	// 학생의 행동 : 공부하기, 성적평균 구하기
	
	//변수
	String name;
	int age;
	String stdNo;
	String major;
	
	String name2;
	int age2;
	String stdNo2;
	String major2;
	
	
	//생성자
	public Student() {
		this("이름없음", 1, "0000000", "없음");
	}
	
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	//메소드 
	//- 공부하기
	public void study(String subject) {
		System.out.println(subject + "(울/를) 공부합니다.");
		//void : 반환타입없음 → return 을 생략 가능
	}
	//- 성적평균 구하기
	public double getAverage(int score1, int score2) {
		double  average = 0.0;
		average = ( double ) (score1 + score2)/2;
		return average;
				
	}
	// 메소드 오버로딩 다형성
	public double getAverage(int score1, int score2, int score3) {
		double  average = 0.0;
		average = ( double ) (score1 + score2)/3;
		return average;
}
	//메소드 오버로딩
	public double getAverage(int[] scores) {
		double  average = 0.0;
		//합계 
		int sum = 0;
		for (int i : scores) {
			sum +=i;
			
		//평균
		average = (double) sum / scores.length;
			
		}
		return average;
		
		
		
}	








}
