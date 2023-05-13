package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch10_03 {

	public static void main(String[] args) throws IOException { 
		System.out.println("1부터 더하고 싶은 자연수를 입력하세요.");
		
		BufferedReader 키보드숫자입력 = new BufferedReader(new InputStreamReader(System.in));
		
		String 입력된숫자 = 키보드숫자입력.readLine();
		
		int 숫자 = Integer.parseInt(입력된숫자);
		
		int i, 합계 = 0;
		for(i=0; i<=숫자; i++) {
			합계 = 합계 + i;
		}
		
		System.out.println("1부터 "+숫자+" 까지 더한 합은 "+합계+" 입니다.");		
	}

}
