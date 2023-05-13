package ch10;

class Exam {
	int c;
	public int add(int a, int b) {
		c = a + b;
		return c;
	}
}

public class Example {

	public static void main(String[] args) {
		int sum;
		int x = Integer.parseInt(args[0]); // 문자열을 정수로 변환해 준다. 
		int y = Integer.parseInt(args[1]);
		
		Exam ob01 = new Exam(); // ob01 객체 생성 클래스 Exam 
		sum = ob01.add(x, y);
		
		System.out.println("입력한 값의 합은 " + sum + " 입니다."); // + 는 더하는게 아니라 문자열 연결이다. 
	}

}
