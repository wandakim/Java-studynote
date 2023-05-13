package ch10;

import java.io.*; // c에서는 include <stdiio.h> 였다. 

public class ch10_01 {

	public static void main(String[] args) throws IOException { 
		System.out.println("만나고 싶은 사람을 입력하세요.");
		
		BufferedReader 키보드입력 = new BufferedReader(new InputStreamReader(System.in));
		
		String 입력된문자열 = 키보드입력.readLine();
		
		System.out.println(입력된문자열+"님의 면회가 신청되었습니다.");
		
	}

}

/* 만나고 싶은 사람을 입력하세요.
Lin
Lin님의 면회가 신청되었습니다. */