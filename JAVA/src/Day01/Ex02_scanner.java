package Day01;

import java.util.Scanner;

// import : 외부 클래스를 포함시키기
// import 패키지명, 클래스명;

// import 하는 법
// 클래스 ctrl + space
// 전체 import : ctrl + shift + 0

// main ctrl +space
public class Ex02_scanner {
	
public static void main(String[] args) {
	// 객체 생성 키워드 : new
	
	Scanner sc = new Scanner(System.in);
	// 에러 - 빨간색 밑줄로 표시
    // 발생시 프로그램 실행불가
	// 경고 - 노란색 밑줄
	// 경고 발생해도 프로그램 실행가능
	System.out.print("a : ");
	int a = sc.nextInt();   //nextln() 정수 하나를 입력받는 메소드
			
	System.out.println("a : "+ a);
	//"문자열"
	// : 큰 따옴표로 묶여있는 데이터
    // "문자열" + 변수(숫자)
	// - 문자열과 숫자를 +(연결 연산자)로 연결할 수 있다.
	//"문자열" + "이 때, 숫자 데이터는 문자열로 변환되어 연결된다.
	
			// close(): scanner 객체를 메모리에서 해제
	sc.close();
	
	//sc.nextInt(); Scanner 객체를 해제한 후에는 더 이상 입력 받지 못함
	
}
}
