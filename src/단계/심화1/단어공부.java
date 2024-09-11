package 단계.심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class 단어공부 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] textList = br.readLine().toUpperCase().split("");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String alpha : textList) {
			map.put(alpha, map.getOrDefault(alpha, 0) + 1);
		}
		
		
		int maxCnt = 0;
		String maxAlpha = null;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			
			if( val >= maxCnt ) {
				if ( maxCnt == val ) maxAlpha = "?";
				else {
					maxAlpha = key;
					maxCnt = val;
				}
			}
			
		}
		
		bw.write(maxAlpha);
		bw.flush();
		bw.close();
		br.close();
	}
}
