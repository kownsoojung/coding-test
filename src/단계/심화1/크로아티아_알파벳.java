package 단계.심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 크로아티아_알파벳 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		String[] alphaList = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for (String alpha : alphaList) {
			text = text.replaceAll(alpha, "!");
		}
		
		bw.write(text.length() + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
