package ch11;

public class 대한민국캡슐화 {
	String 성명;
	private int 주민번호; //0
	String 주소;
	
	public void set주민번호(int 주민번호) { // 메서드를 사용해서만 주민번호에 접근가능하다. 
		if(주민번호>0) { // 캡슐화를 통해 정보의 오용을 막는다. 
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
