package Day03;

public class Ex12_For {

	public static void main(String[] args) {
		// for ( 1초기식 ; 2조건식 ; 4증감식 ) { 3 실행문  }
		//실행 순서: 1 → 반복 ( 2 → 3 → 4 ) 
		
		
		//1. 1~10 까지의 정수를 출력하시오.
		
		for (int i = 1; i < 10; i++) {
			System.out.print(i+" ");
			
		} 
		System.out.println();
        //2. 50~100 정수 출력
		for (int a = 50; a < 100; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();
		//3. 1~20 까지 정수 중 짝수만
		
		for (int b = 1; b < 20 ; b++) {
			if(b%2==0) {
				
				System.out.print(b+" ");
			}
		
		}
		System.out.println();
		//4. 1~20 까지 정수 중 홀수만
		for (int c = 1; c < 20 ; c++) {
			if(c%2==1) {
				
				System.out.print(c+" ");			
		}}
		System.out.println();
	}

}
