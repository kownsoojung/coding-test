package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		for (int a = 0; a < cnt; a++) {
			String text =br.readLine();
			
			if ( text.length() == 1 ) bw.write(text + text + "\n");
			else {
				bw.write(text.substring(0, 1) + text.substring(text.length() -1, text.length() )+ "\n");			
			}
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
