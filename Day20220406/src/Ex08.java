import java.util.Scanner;

public class Ex08 { //��øif��� ��.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num>0) 
			System.out.println("���");
		else {
			if(num==0)
				System.out.println("��");
			else
				System.out.println("����");
		}
		scanner.close();
	}
	
}
