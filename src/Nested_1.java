import java.util.*;

public class Nested_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� (0~100) ?");
		int score = scanner.nextInt(); // ���� �б�
		System.out.print("�� �г� (1~4) ?");
		int year = scanner.nextInt(); // �г� �б�
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("�հ�") ;
			else if (score >=70) 
				System.out.println("�հ�") ;
			else
				System.out.println("���հ�") ;
		}
		
		else 
		System.out.println("���հ�") ;
		scanner.close() ;
	
	}
}
