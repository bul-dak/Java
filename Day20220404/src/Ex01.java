import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		String name = scanner.nextLine();
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ	
//		
//		System.out.println("name: "+name);
//		System.out.println("num: "+num);
//
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		System.out.println("name: "+name);

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ	
		
		System.out.println("num: "+num);

		scanner.close();
	}

}

