
public class Ex02 {

	public static void main(String[] args) {
		//�Լ����� �Է�(O), ���(X)
		int num =2;
		int num2 =5;
		
		System.out.println("main() �Լ�");
		
		sub(num,num2);
		
		System.out.println("main()2 �Լ�");
		
	}
	
	public static void sub(int num,int num2) {
		System.out.println("�� ���� ����: "+(num + num2));
	}

}
