package 단계.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class 나머지 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] list = new int[10];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int a = 0; a < 10; a++) {
			list[a ] = Integer.parseInt(br.readLine());
		}
		
		for (int i : list) {
			int value = i % 42;
			
			map.put(value, map.getOrDefault(value, 0) + 1);
		} 
		
		bw.write(map.size() + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
