package 정렬연습;


import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 { public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int arr[]=new int[6];
	int a=0;
	
	for (int i = 0; i < 6; i++) {
		arr[i] = sc.nextInt();
		
		for (int j = 0; j < i; j++) {
			if (arr[i]<arr[j]) {
				a = arr[j];
				arr[j]=arr[i];
				arr[i]=a;
			}
			
		}
		
	}
	 
	System.out.println();
	arr = Arrays.stream(arr).distinct().toArray();
	
	for (int j : arr) {
		
		System.out.println(j);
	}
	
	
}

}
