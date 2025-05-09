package 단계.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class 커트라인 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String temp = br.readLine();
		
		int n = Integer.parseInt(temp.split(" ")[0]);
		int k = Integer.parseInt(temp.split(" ")[1]);
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Integer[] integerArray = Arrays.stream(list).boxed().toArray(Integer[]::new);
		
		Arrays.sort(integerArray, Collections.reverseOrder());
		
		
		System.out.println(integerArray[k -1]);
		bw.flush();
		br.close();
		bw.close();
	}	
}
