package 단계.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기2 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());

		
		for (int i=1; i <= cnt ; i++) {
			String rValue = "";
			
			for (int b = 1; b <= cnt - i; b++) {
				rValue += " ";
			}
			
			for (int b = 1; b <= i; b++) {
				rValue += "*";
			}
			
			bw.write(rValue + "\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}	

}
