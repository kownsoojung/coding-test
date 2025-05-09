package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class 서로다른부분문자열의개수 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s= br.readLine();
		
		HashMap<String, Integer> aMap = new HashMap<String, Integer>();
		
		for (int a = 0; a < s.length(); a++) {
			for(int b = a + 1;b < s.length() + 1; b++) {
				aMap.put(s.substring(a,b), 0);
			}
				

		}
		
		
		bw.write(aMap.size() + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
