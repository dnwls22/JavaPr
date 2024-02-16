package 클래스연습;

import java.util.Scanner;

public class Ex1226 {
	
	private static int[] lotto;
	private static int[] lotto1;

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
		
	int count = 0;
	
	for(int i=0; i<6; i++) {
		lotto[i]= sc.nextInt();
        for(int j=0; j<i; j++) {
        	lotto1[j]=sc.nextInt();
			if(lotto[i] == lotto1[j]) {
				count++;
				break;
			}

}
			
}
	switch (count) {
	case 7 :
		System.out.println("오류");
		break;
	case 6 :
		System.out.println("1");
		break;
	case 5 :
		System.out.println("2");
		break;
	case 4 :
		System.out.println("3");
		break;
	case 3 :
		System.out.println("4");
		break;
	case 2 :
		System.out.println("5");
		break;
		
		
		default:
			System.out.println("0");
			break;
			
			
		
	}
	
	
	
	
	
	
	
	
	}
}