
public class Ex05 {

	public static void main(String[] args) {
		// //�Լ����� �Է�(O), ���(O)
		int num = 2;
		int num2 = 5;
		
		System.out.println("main() �Լ�!!");
		
		int result = sub(num,num2);
		
		System.out.println("��� ����: "+result);
	}
	public static int sub(int num, int num2) {
		int num3 = num*num2;
		
		System.out.println("sub() �Լ�...");
		
		return num3; //num3�� ������ϰ� return num*num2 �̷��� �ٷκ����� ��.
	}
}
