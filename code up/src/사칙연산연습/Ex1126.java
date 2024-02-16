package 사칙연산연습;

import java.util.Scanner;

public class Ex1126 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		int y = sc.nextInt();
	
		int sum = (x + y);
		int xy = (x * y);
		int xy1 = (x-y);
		int xy2 = (x/y);
		int xy3 = (x%y);
		System.out.printf("%d+%d=%d \n",x,y,sum);
		System.out.printf("%d*%d=%d \n",x,y,xy);
		System.out.printf("%d-%d=%d \n",x,y,xy1);
		System.out.printf("%d/%d=%d \n",x,y, xy2);
		System.out.printf("%d/%d=%d \n",x,y, xy3);
		
		sc.close();

	}

}
