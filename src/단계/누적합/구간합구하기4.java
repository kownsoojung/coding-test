package 단계.누적합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 구간합구하기4 {

	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nm[0];
		int m = nm[1];
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int sum[] = new int[list.length+1];
		sum[0] = 0;
		sum[1] = list[0];
		for (int a = 1; a <list.length; a++) {
			sum[a+1] = sum[a] + list[a];
		}
		
		for (int a = 0; a < m; a++) {
			int[] ij =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			bw.write(sum[ij[1]] - sum[ij[0]-1]+ "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
}

