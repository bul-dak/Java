import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		int sum = 0;
		int num;
		
		boolean flag = true;
		
		Scanner scanner = new Scanner(System.in);

		 while (flag) { 
			
			System.out.print("��Ģ���� ��ȣ�� �Է��ϼ���.(����� q)"); 
			String str = scanner.nextLine();
			char ch = str.charAt(0);
			
			System.out.print("���ڸ� �Է��ϼ���.(����� ����0"); 
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			switch (ch) {
				case '+' :
					sum += num;
					System.out.println("sum: "+(sum+=num));
					break;
				case '-' :
					sum -= num;
					System.out.println("sum: "+(sum-=num));
					break;
				case '*' :
					sum *= num;
					System.out.println("sum: "+(sum*=num));
					break;
				case '/' :
					sum /= num;
					System.out.println("sum: "+(sum/=num));
					break;
				case 'q' :
					flag = false;
					System.out.println("�����մϴ�.");
					
			}  //end of switch 
			System.out.println();
		}  //end of while
		
		System.out.println("���հ��: "+sum);
		scanner.close();
	}

}
