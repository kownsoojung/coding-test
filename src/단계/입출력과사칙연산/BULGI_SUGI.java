package 단계.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BULGI_SUGI {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ab = Integer.parseInt(br.readLine());
		
	    
	    br.close();
	    
	    System.out.println(ab-543);
	}
}
