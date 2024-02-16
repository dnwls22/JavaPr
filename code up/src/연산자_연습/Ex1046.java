package 연산자_연습;

import java.util.Scanner;

public class Ex1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int sum = (x + y + z);
		double Avg = sum /3.0;
		
		System.out.println(sum);
		System.out.printf("%.1f",Avg);
		//%.자릿수f 소수점 제한
		//
		
		sc.close();
				
				

	}

}
