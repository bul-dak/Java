import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	      String tmp;
	      String i;
	      int num = 0, sum = 0;
	      Scanner scanner = new Scanner(System.in);
	      Outer:
	      for (;;) {

	         System.out.println("(q) ������");
	         System.out.println("(+) ���ϱ�");
	         System.out.println("(*) ���ϱ�");
	         System.out.println("(/) ������");
	         System.out.println("(-) ����");

	         tmp = scanner.nextLine();
	         char menu = tmp.charAt(0);
	         if (menu == 'q') {
	            System.out.println("���α׷��� �����մϴ�.");
	            System.out.println("totalsum = " + sum);
	            break Outer;
	         }

	         System.out.println("���ڸ� �Է��ϼ���.");
	         i = scanner.nextLine();
	         num = Integer.parseInt(i);

	         switch (menu) {
	         case '+':
	            sum += num;
	            break;
	         case '*':
	            sum *= num;
	            break;
	         case '/':
	            sum /= num;
	            break;
	         case '-':
	            sum -= num;
	            break;
	         default:
	            System.out.println("�߸��� �Է��Դϴ�.");
	            break;
	         }
	         System.out.println("\nsum =" + sum);

	      }

	}

}
