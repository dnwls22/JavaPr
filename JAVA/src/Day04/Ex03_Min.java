package Day04;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N  개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최솟값을 출력하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력예시) 
		// 최댓값 : 55
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int arr[] = new int [N]; 
		
		int Min = Integer.MAX_VALUE;
		
		//입력과 최솟값 비교를 동시에 할 수도 있다.
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if( Min > arr[i] ) {
				Min = arr[i];
			}
			
		}
		
		System.out.println("최솟값은 : " + Min);
		sc.close();
	}

}
