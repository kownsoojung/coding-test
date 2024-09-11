package 단계.입출력과사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지구하기 {
public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] abc = br.readLine().split(" ");
		int A = Integer.parseInt(abc[0]);
		int B = Integer.parseInt(abc[1]); 
		int C = Integer.parseInt(abc[2]); 
				
	    
	    br.close();
	    
	    System.out.println( (A+B)%C);
	    System.out.println(((A%C) + (B%C))%C);
	    System.out.println( (A*B)%C);
	    System.out.println( ((A%C) * (B%C))%C);
	}
}
