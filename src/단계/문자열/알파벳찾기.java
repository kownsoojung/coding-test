package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 알파벳찾기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		String[] alphabet = new String[26];
        char currentChar = 'a';

        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(currentChar);
            currentChar++;
        }

        String result = "";
		for(String a : alphabet) {
			result += text.indexOf(a) + " "; 
		}
		
		result.trim();
		bw.write(result);
		
		bw.flush();
		br.close();
		bw.close();
	}
}
