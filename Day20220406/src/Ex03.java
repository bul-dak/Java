import java.util.Scanner;

public class Ex03 { //Ű����� �� ������ �Է� �޾Ƽ�, ������ ����� ����Ѵ�.

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�.>");
		
		Scanner scanner = new Scanner(System.in);
		
		String n1 = scanner.nextLine();
		String n2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1+num2;
		double aver = sum/2.0;
		
		System.out.println("�հ�: "+sum+" ���: "+aver);
		
		scanner.close();
	}

}
