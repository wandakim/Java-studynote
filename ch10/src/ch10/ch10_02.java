package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch10_02 {

	public static void main(String[] args) throws IOException { 
		System.out.println("더하고 싶은 숫자1을 입력하세요.");
		
		BufferedReader 키보드숫자입력 = new BufferedReader(new InputStreamReader(System.in));
		
		String 입력된숫자1 = 키보드숫자입력.readLine();
		
		int 숫자1 = Integer.parseInt(입력된숫자1);
		
		
		System.out.println("더하고 싶은 숫자2를 입력하세요.");
		
		String 입력된숫자2 = 키보드숫자입력.readLine();
		
		int 숫자2 = Integer.parseInt(입력된숫자2);
		
		int 덧셈합 = 숫자1 + 숫자2;
		
		
		System.out.println(숫자1 + " + " + 숫자2 + " = " + 덧셈합 + " 입니다");		
	}

}
