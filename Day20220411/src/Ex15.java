import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
	      String input, ch;
	      
	      Scanner scanner = new Scanner(System.in);
	      
	      while(true) {
	         System.out.print("���� ��ȣ �Է�.(�����ϰ� �ʹٸ� q) --> ");
	         input = scanner.nextLine();
	         ch = input;
	         
	         if(ch.equals("q")) {
	              System.out.println("�����մϴ�.");
	              System.out.println("���� : " + sum);
	              break;
	           }
	         
	         System.out.print("���� �Է�. -> ");
	         input = scanner.nextLine();
	         num = Integer.parseInt(input);
	         
	         if(ch.equals("+")) {
	            System.out.printf("%d + %d = %d%n", sum, num, sum+num);
	            sum += num;
	         }
	         
	         if(ch.equals("-")) {
	            System.out.printf("%d - %d = %d%n", sum, num, sum-num);
	            sum -= num;
	         }

	           if(ch.equals("*")) {
	              System.out.printf("%d * %d = %d%n", sum, num, sum*num);
	              sum *= num;
	           }

	           if(ch.equals("/")) {
	              System.out.printf("%d / %d = %d%n", sum, num, sum/num);
	              sum /= num;
	           }
	           
	      
	      }


	}

}
