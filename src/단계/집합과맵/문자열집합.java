package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class 문자열집합 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nm =  br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		Map<String, Integer> nMap = new HashMap<String, Integer>();
		
		for (int a = 0; a < n; a++) {
			nMap.put(br.readLine(), 0);
		}
	
		for (int a = 0; a < m; a++) {
			String text = br.readLine();
			if ( nMap.containsKey(text) ) {
				nMap.put(text , nMap.get(text) + 1);
			}
		}
		
		int rtn = 0;
		for (String key : nMap.keySet()) {
			rtn +=nMap.get(key);
		}
		
		
		System.out.println(rtn);
		bw.flush();
		br.close();
		bw.close();
	}
}
