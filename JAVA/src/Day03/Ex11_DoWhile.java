package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {

	public static void main(String[] args) {
		//메뉴판
		//변수 선언 : 메뉴 번호, 메뉴 이름
		int Num = 0;
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		//do~while 문
		//1회 실행 후 조건 검사하여 반복하는 문장
		
		do {
			System.out.println("########### 메뉴판 ##########");
			System.out.println("1. 맥도날드");
			System.out.println("2. 법대생김밥");
			System.out.println("3. 돈까스");
			System.out.println("4. 짜장면");
			System.out.println("5. 물만난면");
			System.out.println("0. 종료");
			System.out.print("메뉴번호: ");
			
			//메뉴번호 입력
			menuNo = sc.nextInt();
			
			//break : 제어문을 탈출
			if ( menuNo == 0) break;
			//방법 2
			//return
			//1. 메소드를 종료
			//2. 메모리 공간해제
			//3. (값) 메소드를 호출한 곳으로 반환
			//if ( menuNo == 0) { System.out.println("메뉴판을 종료합니다.");  return;}
				
			switch (menuNo) {
			
		
			case 1: menuName = "맥도날드"; break;
			
			case 2: menuName = "법대생김밥"; break;
			case 3: menuName = "돈까스"; break;
			case 4: menuName = "짜장면"; break;
			case 5: menuName = "물만난면"; break;
            default: break;
				
			}
			// 메뉴번호 유효성 검사
			//방법 1 번호가 0~5번만 유효
			//방법 2 0번만 아니면 유효
			//방법 3 1~5번 유효, 그 이외 유효X
			if (menuNo >=1 && menuNo <= 5) {
			//if( menuNo !=0)
			System.out.println(menuName + "(을/를) 주문하였습니다.");
			Num = Num + 1;
			// count++;
			
			}
			else
				System.out.println("(0~5)번 사이의 번호를 입력해주세요.");
		 
		} 
		
		while (menuNo != 0);
		
		//주문한 메뉴 개수를 출력해주세요.
		
		System.out.println( Num + " 개의 메뉴를 주문하였습니다.");
		System.out.println("메뉴판을 종료합니다.");
		
		sc.close();
		

	}

}
