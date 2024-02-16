package 배열연습;

import java.util.Scanner;

public class Ex1503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int k = 1;
		
		for (int i = 0; i < N; i++) {
			if (i%2==0) {
				for (int j = 0; j < arr[i].length; j++) { 
					arr [i][j] = k++;
				}
				}
			
			else { for (int j = N-1; j >= 0; j--) {
				arr[i][j] = k++;
			}
			}
			}
			
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}

	}


