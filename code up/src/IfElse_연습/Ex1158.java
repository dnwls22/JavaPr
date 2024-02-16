package IfElse_연습;

import java.util.Scanner;

public class Ex1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//if((30<=a && 40>=a) || (60<=a && 70>=a)) win
		//else 프린트 lose
		if(30<=a && 40>=a) {
			System.out.println("win");	
		}
		else if(60<=a && 70>=a) {
			System.out.println("win");
		}
		else {
			System.out.println("lose");
		}

	}

}
