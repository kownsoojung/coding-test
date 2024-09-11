package 단계.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 코딩은_체육과목_입니다 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		br.close();

		String msg = "";
		
		int nFor = cnt / 4;
		
		for (int i=1; i <= nFor ; i++) {
			msg += "long "; 
		}
		
		
		System.out.println(msg + "int");
		
	}	
}
