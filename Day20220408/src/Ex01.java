
public class Ex01 { 

	public static void main(String[] args) {
		int sum =0;  //�հ踦 �����ϱ� ���� ����.
		int i=1;
		
		for(;i<=6;i++) {
			i++;
			sum += i; 
			System.out.println("i="+i+", sum="+sum);
		}
		System.out.println("i="+i+" Last sum="+sum);	
	}

}
