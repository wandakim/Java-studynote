package ch11;

public class 대한민국캡슐화23년생 {
	String 성명;
	private int 주민번호; //0
	String 주소;
	int check;
	
	public void set주민번호(int 주민번호) {
		check = 주민번호/10000;
		if(check == 23) {
			this.주민번호 = 주민번호;
		} else {
			System.out.println("주민번호는 올바른 입력이 아닙니다.");
		}
	}
	
	public void 민증까() {
		System.out.println(성명+" 의 주소는 "+주소+" 입니다.");
		System.out.println(성명+" 의 주민번호는 "+주민번호+" 입니다."); // 자동 형변
	}
}
