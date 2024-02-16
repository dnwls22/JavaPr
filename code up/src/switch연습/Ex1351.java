package switch연습;

import java.util.Scanner;

public class Ex1351 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = 1; i < 10 ; i++) {
			int result = a * i;
			System.out.println(a + "*" + i + " = " + result);
		}
		
		
		for (int i = 1; i < 10 ; i++) {
			int result = b * i;
			System.out.println(b + "*" + i + " = " + result);
		}
		
		
		
		
		
		
		sc.close();
	}

}
