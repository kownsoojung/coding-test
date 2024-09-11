package 단계.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A더하기B빼기5 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String a = br.readLine();
			if (a == null) break;
			int[] temp = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
			
			bw.write((temp[0] + temp[1]) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}	
}
