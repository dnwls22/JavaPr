package switch연습;

import java.util.Scanner;

public class Ex1353 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //바깥쪽 반복분 : 행 (i)
        for ( int i = 1 ; i<=n; i++) {
        	//안 쪽 반복문 : 열 (j)
         for(int j=1; j<=i; j++)
        	{System.out.print("*");
        	 }
         
         System.out.println();  
        }
        
       
        
        }
	

	}


