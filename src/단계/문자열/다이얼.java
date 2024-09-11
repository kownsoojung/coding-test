package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class 다이얼 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 3);map.put("B", 3);map.put("C", 3);
		map.put("D", 4);map.put("E", 4);map.put("F", 4);
		map.put("G", 5);map.put("H", 5);map.put("I", 5);
		map.put("J", 6);map.put("K", 6);map.put("L", 6);
		map.put("M", 7);map.put("N", 7);map.put("O", 7);
		map.put("P", 8);map.put("Q", 8);map.put("R", 8);map.put("S", 8);
		map.put("T", 9);map.put("U", 9);map.put("V", 9);
		map.put("W", 10);map.put("X", 10);map.put("Y", 10);map.put("Z", 10);

		
		String[] list =  br.readLine().split("");
		
		int sum = 0;
		for (String a : list) {
			sum += map.get(a);
		}
		
		bw.write(sum + "");
		bw.flush();
		br.close();
		bw.close();
	}
}
