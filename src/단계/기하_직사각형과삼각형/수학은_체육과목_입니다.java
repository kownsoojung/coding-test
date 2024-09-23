package 단계.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수학은_체육과목_입니다 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		long cnt = Long.parseLong(br.readLine());
		
		System.out.println((cnt * 3) + cnt);
	}	
}
