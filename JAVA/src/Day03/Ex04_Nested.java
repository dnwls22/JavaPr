package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
	  
		
		Scanner sc = new Scanner(System.in);
		//정보처리기사 자격증 합격기준
		//4학년, 60점 이상 - 합격 
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		//중첩 if문 권장하지 않음
		//4학년 
		//60점 이상
		if(year == 4 && score>=60) {
			System.out.println("합격!");
		}
		if( year ==4 && score < 60) {
			System.out.println("불합격!");
		}
		if(year != 4){	
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		}
		
	
		}
	

	}


/*  else if ( year ==4 ) 불합격 */
