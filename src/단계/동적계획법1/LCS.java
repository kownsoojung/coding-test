package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LCS {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] data1 = br.readLine().split("");
		String[] data2 = br.readLine().split("");
		int[][] result = new int[data1.length + 1][data2.length + 1];
		
		int max = 0;
		
		for (int a = 1; a <= data1.length; a++) {
			for (int b = 1; b <= data2.length; b++) {
				if (data1[a - 1].equals(data2[b-1])) {
					result[a][b] = result[a-1][b-1] + 1;
				}
				else {
					result[a][b] = Math.max(result[a][b-1], result[a-1][b]);
				}
				
				max = Math.max(max, result[a][b]);
			}
		}
		
		System.out.println(max);
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	

}
