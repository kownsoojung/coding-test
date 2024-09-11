package 단계.심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팰린드롬인지_확인하기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text= br.readLine();
		String[] textList = text.split("");
		String reversText = "";
		
		for( int a = textList.length -1; a >= 0; a-- ) {
			reversText+=textList[a];
		}
				
		if (text.equals(reversText) ) bw.write("1\n");
		else bw.write("0\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}
