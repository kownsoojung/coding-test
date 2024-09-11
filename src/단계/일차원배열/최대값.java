package 단계.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 최대값 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] list = new int[9];
		
		
		for(int a = 0; a < 9; a++) {
			list[a] = Integer.parseInt(br.readLine());
		}
		
		int max = list[0];
		int line = 1;
		
		
		for(int a = 1; a < 9; a++) {
			if (list[a] > max) {
				max = list[a];
				line = 1 + a;
			}
		}
		
		
		bw.write(max + "\n");
		bw.write(line + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
