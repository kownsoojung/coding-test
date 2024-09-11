package 단계.일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 세탁소사장_동혁 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		for (int a = 0; a <cnt; a++) {
			int cent = Integer.parseInt(br.readLine() );
			String value = "";
			
			value += (cent / 25) + " ";
			cent = cent % 25;
			
			value += (cent / 10) + " ";
			cent = cent % 10;
			
			value += (cent / 5) + " ";
			cent = cent % 5;
			
			value += (cent / 1) + " ";
			
			bw.write(value.trim() + "\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
