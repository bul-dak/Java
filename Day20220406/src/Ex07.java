import java.util.Scanner;

public class Ex07 { //���� �Է¹޾Ƽ� -> 90�̻� A, 80�̻� B, 70C, 60D, 60����F.

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String score = scanner.nextLine();
		
		int num = Integer.parseInt(score);
		
		if(num >=90 && num <=100)
			System.out.println("A�����Դϴ�.");
		
		else if (num >= 80 && num <90)
			System.out.println("B�����Դϴ�.");
		
		else if (num >= 70 && num < 80)
			System.out.println("C�����Դϴ�.");
		
		else if (num >= 60 && num < 70)
			System.out.println("D�����Դϴ�.");
		
		else if (num <= 50 && num >= 0)
			System.out.println("F�����Դϴ�.");
		
		scanner.close();
	}

}
