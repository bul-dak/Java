
class Exercise6_5 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
	}

}

class Student2 {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor + eng + math;
	}

	double getAverage() {
//		return getTotal()/3.0;
		return (int)((getTotal()/3.0+0.05)*10)/10.0;
	}
	
}