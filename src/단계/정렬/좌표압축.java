package 단계.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class 좌표압축 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] copyList = list.clone();
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		
		Arrays.sort(copyList);
		copyList = Arrays.stream(copyList).distinct().toArray(); 
		
		int rank = 0;
		
		for (int i : copyList) {
			rankingMap.put(i, rank);
			rank++;
		}
		
		for (int a = 0; a < list.length; a++) {
			bw.write(rankingMap.get(list[a]) + " ");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
