import java.util.Scanner;

public class Ex05 { //p.172 4-27

	public static void main(String[] args) {
		int num;
		int sum=0;
		boolean flag = true; //while문의 조건식으로 사용될 변수
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");		
		
		while (flag) { 
			System.out.println(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num !=0) {
				sum += num;
			} else {
				flag = false;
			}
		}
	
		System.out.println("합계 : "+ sum);
		scanner.close();
		
	}

}
