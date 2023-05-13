package ch10;

public class ch10_04 {

	public static void main(String[] args) {
		double 실수 = 577.2345;
		byte 바이트 = (byte) 실수;
		char 문자열 = (char) 바이트;
		
		System.out.println("double 형태입니다. "+실수);
		System.out.println("byte 형태입니다. "+바이트); // 0~255까지 돌고
		System.out.println("char 형태입니다. "+문자열);

	}

}
//double 형태입니다. 577.2345
//byte 형태입니다. 65
//char 형태입니다. A
