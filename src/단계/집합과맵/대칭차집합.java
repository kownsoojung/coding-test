package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class 대칭차집합 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int[] ab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		HashMap<Integer, Integer> aMap = new HashMap<Integer, Integer>();
		
		int[] aList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] bList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		
		int dupCnt = 0;
		for (int a = 0; a < ab[0]; a++) {
			aMap.put(aList[a], 0);
		}
		
		for (int a = 0; a < ab[1]; a++) {
			if ( aMap.containsKey(bList[a]) ) dupCnt++;
		}
		
		
		bw.write(aList.length + bList.length - (dupCnt *2) + "");
	
		
		bw.flush();
		br.close();
		bw.close();
	}
}
