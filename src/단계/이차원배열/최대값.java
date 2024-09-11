package 단계.이차원배열;

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
		
		
		int[][] list = new int[9][9];
		int max = 0;
		String rValue = "1 1";
		
		for (int i = 0; i < 9; i++) {
			list[i] =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		for (int a = 0; a < list.length; a++) {
			for (int b = 0; b < list[a].length; b++) {
				if (max < list[a][b]) {
					max = list[a][b];
					rValue = (a + 1)+ " " + (b + 1);
				}
			}
		}
		
		bw.write(max  + "\n");
		bw.write(rValue);
		bw.flush();
		bw.close();
		br.close();
	}
}
