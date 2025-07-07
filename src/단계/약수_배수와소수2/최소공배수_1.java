package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 최소공배수_1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t= Integer.parseInt(br.readLine());
		int tList[][] = new int[t][2];
		
		for (int a = 0; a < t; a++) {
			tList[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		

		for (int a = 0; a < t; a++) {
			// 최대공약수
			int n = eucd(Math.max(tList[a][0], tList[a][1]), Math.min(tList[a][0], tList[a][1]));
			bw.write((tList[a][0]* tList[a][1]) / n + "\n");	
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static int eucd(int max, int min) {
		int r = max % min;
		
		if (r == 0) return min;
		else return eucd(min, r);		
	}
}
