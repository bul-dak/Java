
public class Ex03 {

	public static void main(String[] args) {
		//p.171 4-25 1���� ����� ���ϸ� �����հ谡 100�� ���� �ʴ� ���� ū ���� �ɱ�?

			int i = 0;
			int sum = 0;
			
			while ((sum += ++i)<=100) { 
				System.out.println(i +"-"+ sum);
			}
	}

}
