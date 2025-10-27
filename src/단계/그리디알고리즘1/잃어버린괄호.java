package 단계.그리디알고리즘1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 잃어버린괄호 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String data = br.readLine();
		
		int minus= 0;
		int plus = 0;
		
		
		String[] parts = data.split("(?=[+-])|(?<=[+-])");
		
		
		boolean isMinus = false;
		for (String a : parts) {
			
			if (a.equals("+") || a.equals("-")) {
				if (a.equals("-")) {
					isMinus = true;
				}
				
				continue;
			}
			
			if (isMinus) minus += Integer.parseInt(a);
			else plus += Integer.parseInt(a);
		}
		
		bw.write(plus - minus + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
