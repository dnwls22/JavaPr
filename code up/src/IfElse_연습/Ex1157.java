package IfElse_연습;

import java.util.Scanner;

public class Ex1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		if(60.0>=a && 50.0<=a) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}

	}

}
