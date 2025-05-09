package 단계.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 대표값2 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] list = new int[5];
		
		for (int a = 0; a < 5; a++) {
			list[a] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(list);
		
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		
		System.out.println(sum/5);
		System.out.println(list[2]);
		bw.flush();
		br.close();
		bw.close();
	}	
}
