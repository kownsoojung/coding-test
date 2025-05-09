package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class 숫자카드2 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] nList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		LinkedHashMap<Integer, Integer> nMap = new LinkedHashMap<Integer, Integer>();
		
		
		int m = Integer.parseInt(br.readLine());
		int[] mList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
			
		for (int a = 0; a < n; a++) {
			nMap.put(nList[a], nMap.getOrDefault(nList[a], 0) + 1);
		}
		
		for (int b = 0; b < m; b++) {
			if ( nMap.containsKey(mList[b]) ) {
				bw.write(nMap.get(mList[b]) + " ");
			}
			else {
				bw.write("0 ");
			}
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
