
public class Ex02 { //�ú��� ���ϴ� �ڵ�

	public static void main(String[] args) {
		int num=4000;
		
		int hour=num/3600;
		System.out.println(num/3600);
		int minute=num%3600/60;
		System.out.println(num%3600/60);
		int s=num%60;
		
		System.out.println(num + "�ʴ�" + hour + "�ð�" + minute + "��" + s +"���Դϴ�.");
	}

}
