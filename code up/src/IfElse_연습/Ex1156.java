package IfElse_연습;

import java.util.Scanner;

public class Ex1156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if((a%2)==0) {
			System.out.println("even");
		}
		if((a%2)==1) {
			System.out.println("odd");
		}

	}

}
