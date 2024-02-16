package switch연습;

import java.util.Scanner;

public class Ex1355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <=a; i++) {
		
			for (int j = i; j >=1; j--) {
				System.out.print("*");
			for (int j2 = 1; j2 <=a; j2++) {
				System.out.print("");
			}
				
			
			}
			System.out.println();
			
		}
	
}

}
