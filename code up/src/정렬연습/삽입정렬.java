package 정렬연습;

import java.util.Scanner;

public class 삽입정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; 
	    
		
	        for(int i=1; i<n; i++){
	            int ins_point = i;
	            int ins_value = arr[i]; 
	            
	           
	            for(int j=i-1;j>=0;j--){
	                if(arr[j]<ins_value){
	                    ins_point = j+1;
	                    break; 
	                }
	                if(j==0){
	                    ins_point=0;
	                }
	            }
	            
	            
	            for(int j=i;j>ins_point;j--){
	                arr[j] = arr[j-1];
	            }
	            
	           
	            arr[ins_point] = ins_value;
	        }
	        
	        for (int j : arr) {
				System.out.println(j);
			}
	}

}
