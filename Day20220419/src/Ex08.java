import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		//기본형, 참조형
		//기본형 --> int, double >> 기본형 변수 공간안에는 값이 저장됨.
		//참조형 --> String >>참조형 변수 공간안에는 주솟값이 저장됨.
		
		String[] name = new String[3];
		int[] age = new int[3];
		
		System.out.println(Arrays.toString(age));
		
	}

}
