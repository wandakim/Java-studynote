package ch11;

public class 대한민국this {
	String 성명;
	int 주민번호;
	String 주소;
	
	public 대한민국this(String 성명, int 주민번호, String 주소) {
		this.성명 = 성명;
		this.주민번호 = 주민번호;
		this.주소 = 주소; 
	}
	
	public void 민증까() {
		System.out.println(성명+" 의 주소는 "+주소+" 입니다.");
		System.out.println(성명+" 의 주민번호는 "+주민번호+" 입니다."); // 자동 형변
	}
}
