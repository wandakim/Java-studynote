package ch11;

public class 대한민국인수포함 {
	String 성명;
	int 주민번호;
	String 주소;
	
	public 대한민국인수포함(String 성명인수, int 주민번호인수, String 주소인수) {
		성명 = 성명인수;
		주민번호 = 주민번호인수;
		주소 = 주소인수; 
	}
	
	public void 민증까() {
		System.out.println(성명+" 의 주소는 "+주소+" 입니다.");
		System.out.println(성명+" 의 주민번호는 "+주민번호+" 입니다."); // 자동 형변
	}
}
