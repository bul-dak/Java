import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		boolean flag = true;
		
		Scanner scanner = new Scanner(System.in);

		 while (flag) { 
			
			System.out.print("��Ģ���� ��ȣ�� �Է��ϼ���.(����� q)"); 
			String ch = scanner.nextLine();
			if ("q".equals(ch)) break;
			
			System.out.print("���ڸ� �Է��ϼ���.(����� �ƹ�����)"); 
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if ("+".equals(ch)) {
				System.out.println("sum : "+(sum += num)); 
			} else if ("-".equals(ch)) {
				System.out.println("sum : "+(sum -= num)); 
			} else if ("*".equals(ch)) {
				
				System.out.println("sum : "+(sum *= num)); 
			} else if ("/".equals(ch)) {
				System.out.println("sum : "+(sum /= num)); 
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		}
		
	
		System.out.println("���հ��: "+sum);
		scanner.close();
	}

}
