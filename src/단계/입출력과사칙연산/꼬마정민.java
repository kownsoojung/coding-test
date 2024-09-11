package 단계.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 꼬마정민 {
	public static void main(String args[]) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    String[] b = br.readLine().split(" ");
	    
	    System.out.println(Long.valueOf(b[0]) + Long.valueOf(b[1]) + Long.valueOf(b[2]));
	    
	}
}
