package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 단어의개수 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String text =  br.readLine().trim();
		
		if (text.length() == 0) bw.write(0 + ""); 
		else {
			String[] values = text.split(" ");
			bw.write(values.length + "");
			
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
