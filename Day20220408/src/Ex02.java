import java.util.Scanner;

public class Ex02 { //p.150 4-7������ if������ Ǯ� ��.

	public static void main(String[] args) {
		System.out.print("����(1),����(2),��(3)�� �ϳ��� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("�����"+user+"�Դϴ�.");
		System.out.println("����"+com+"�Դϴ�.");
		
		if(user-com==0) {
			System.out.println("�����ϴ�.");
		} else if(user-com==2 || user-com==-1) {
			System.out.println("����� �����ϴ�.");
		} else
			System.out.println("����� �̰���ϴ�.");

		scanner.close();
	}

}
