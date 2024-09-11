package 단계.일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 진법변환 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		br.close();
		String alpha = text.split(" ")[0];
		
		int cnt = Integer.parseInt(text.split(" ")[1]);
		
		System.out.println(Integer.parseInt(alpha, cnt));
		
		
	}
}
