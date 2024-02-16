package 사칙연산연습;

import java.util.Scanner;
//* 두 정수를 입력받아 아래와 같이 출력하시오.

public class Ex1116 {

	public static void main(String[] args) {
		// 1. 두 정수 입력
		Scanner sc = new Scanner(System.in);
//		System.out.print("x : ");
		int x = sc.nextInt();
		
//		System.out.print("y : ");
		int y = sc.nextInt();
		
		
		// 2. 덧셈/뺄셈/곱셈/나눗셈 결과 구하기
		// 3. 출력 양식에 맞게 출력
		// ex) 3+2=5
		
		
		
		
		
		int sum = (x + y);
		int xy = (x * y);
		int xy1 = (x-y);
		int xy2 = (x/y);
		//System.out.println(a + "+" + b + "=" + (a+b));
		System.out.printf("%d+%d=%d \n",x,y,sum);
		System.out.printf("%d*%d=%d \n",x,y,xy);
		System.out.printf("%d-%d=%d \n",x,y,xy1);
		System.out.printf("%d/%d=%d \n",x,y, xy2);
		
		sc.close();

	}

}
