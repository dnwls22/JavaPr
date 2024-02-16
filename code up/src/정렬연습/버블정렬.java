package 정렬연습;

import java.util.Arrays;
import java.util.Scanner;

public class 버블정렬 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[]=new int [6];
	int a = 0;
	
	for (int i = 0; i < 6; i++) {
		arr[i] = sc.nextInt();
		for (int j = 0; j < i; j++) {
			if (arr[j]>arr[j+1]) {
				a = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=a;
			}
			
		}
		
		
	}
	arr= Arrays.stream(arr).distinct().toArray();
	System.out.println();
	
	for (int j : arr) {
		System.out.println(j);
	}
}

}
