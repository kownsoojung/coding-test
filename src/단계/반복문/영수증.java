package 단계.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 영수증 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int amt = Integer.parseInt(br.readLine());
		int cnt = Integer.parseInt(br.readLine());
		int value = 0;
		
		for (int i=1; i <= cnt ; i++) {
			int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			value = value + (temp[0] * temp[1]); 
		}
		
		br.close();
		
		if (value == amt) System.out.println("Yes");
		else System.out.println("No");
		
	}	
}
