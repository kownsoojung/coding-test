package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;

public class 숫작카드 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] nList = br.readLine().split(" ");
		
		int m = Integer.parseInt(br.readLine());
		String[] mList = br.readLine().split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for (int a = 0; a < mList.length; a++) {
			map.put(mList[a], 0);
		}
	
		for (int a = 0; a < nList.length; a++) {
			if ( map.containsKey(nList[a]) ) {
				map.put(nList[a], 1);
			}
		}
		
		for (String key : map.keySet()) {
			
		    System.out.print(map.get(key) + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
