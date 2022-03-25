import java.util.*;

public class Nested_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇점 (0~100) ?");
		int score = scanner.nextInt(); // 점수 읽기
		System.out.print("몇 학년 (1~4) ?");
		int year = scanner.nextInt(); // 학년 읽기
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("합격") ;
			else if (score >=70) 
				System.out.println("합격") ;
			else
				System.out.println("불합격") ;
		}
		
		else 
		System.out.println("불합격") ;
		scanner.close() ;
	
	}
}
