package IfElse_연습;

import java.util.Scanner;

public class Ex1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a-b);
		}
		if(b>a) {
			System.out.println(b-a);
		}
		if(a==b) {
			System.out.println(0);
		}

	}

}
