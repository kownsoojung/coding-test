package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자와문자열 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text =br.readLine();
		int num = Integer.parseInt(br.readLine()) -1;
		
		
		System.out.println(text.substring(num, num  + 1));
		
		bw.flush();
		br.close();
		bw.close();
	}
}
