package switch연습;

import java.util.Scanner;

public class Ex1354 {
	
	public static void main(String[] args) {
		
	
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    
    for (int i = a;  i <= a; i--) {
    	if(i==0) {
    		break;
    	}
    	for (int j = 0; j < i; j++) {
    		System.out.print("*");
		}
    	
    	System.out.println();
	
}

}
}