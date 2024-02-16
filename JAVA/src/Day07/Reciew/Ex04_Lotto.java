package Day07.Reciew;

public class Ex04_Lotto {
public static void main(String[] args) {
	//Math.random() : 0.XXXX~0.9XXX 사이의 난수를 반환하는 메소드
	
	double random = Math.random();
	System.out.println(random);
	
	//1~6 사이의 정수 : 주사위
	//Math.random() : 0.XXXX~0.9XXX
	//Math.random()*10 : X.XX~9.XXX
	//(int) (Math.random()*10) : 0~9(10개)
	//(int) (Math.random()*6) : 0~5(5개)
	//(int) (Math.random()*6)+1 : 0~6(6개)
	int dice = (int) (Math.random()*6)+1;
	System.out.println("주사위 : " + dice);
	
	//1~45 사이의 정수 : 로또
	
	int lotto = (int) (Math.random()*45) +1;
	System.out.println("로또 랜덤 번호 : " + lotto);
	
	// 공식 : (int) (Math.random()*[개수]) + [시작숫자]
	
	//1~20 사이의 랜덤수
	int a1 =(int) (Math.random()*20) +1;
	System.out.println(a1);
	
	//-20~20 사이의 랜덤수
	int a2 = (int) (Math.random()*41)-20;
	System.out.println(a2);
	
	//1~45 사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오. 
	//(과제) : 중복제거, 오름차순 정렬
	int max = Integer.MIN_VALUE;
	
	int arr[] = new int[6];
	
	for (int i = 0; i < arr.length; i++) {
		int a3 = (int) (Math.random()*45+1);
		arr[i] = a3;
		
		for (int j = 0; j < i; j++) {
			arr[j]= a3;
			if(arr[i]==arr[j]) {
				i--;
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();		
	}
	
	//for (int i : arr) {
		//System.out.print(i+" ");}
	//System.out.println();
}
}
