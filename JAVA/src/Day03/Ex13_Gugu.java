package Day03;

import java.util.Scanner;

public class Ex13_Gugu {

	public static void main(String[] args) {
		// 구구단 (1~9단)
		// 원하는 단을 입력받아 아래와 같이, 구구단 수식을 출력하시오.
		// 입력 : 3
		// 출력
		// 3*1=3
		// 3*2=6
		// 3*3=9
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int a = sc.nextInt();
		
		for (int i = 1; i < 10 ; i++) {
			int result = a * i;
			System.out.println(a + "*" + i + " = " + result);
		}
		sc.close();

	}

}
