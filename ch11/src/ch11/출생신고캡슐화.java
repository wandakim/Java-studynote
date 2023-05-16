package ch11;

public class 출생신고캡슐화 {

	public static void main(String[] args) {
		대한민국캡슐화 국민_01 = new 대한민국캡슐화();
		국민_01.성명 = "뉴진스";
		국민_01.주소 = "경기도";
		국민_01.set주민번호(-123432);
		
		
		국민_01.민증까();

	}

}
