package 단계.재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 알고리즘수업_병합정렬1 {
	
	static int[] A;
	static int N;
	static int K;
	static int result = -1;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] readData = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int saveCnt = readData[1];
		A = new int[readData[0]];
		
		for(int i = 1; i <= saveCnt; i++) {
			A[i -1] = i;
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

}
