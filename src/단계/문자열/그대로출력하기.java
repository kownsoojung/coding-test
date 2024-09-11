package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 그대로출력하기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputText = null;
		while (( inputText = br.readLine() ) != null) {
			bw.write(inputText + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
