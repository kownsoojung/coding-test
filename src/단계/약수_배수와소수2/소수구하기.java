package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class 소수구하기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		
		int min = n[0];
		if (n[0] <= 2) {
			nList.add(2);
			min = 3;
		}
		
		for (int i = min; i <= n[1]; i++) {
			boolean isTrue = true;
			for(int a = 2; a <= Math.sqrt(i); a++) {
				if (i % a == 0 ) {
					isTrue = false;
					break;
				}
			}
			
			if (isTrue) nList.add(i);
			
		}
		
		for (Integer data : nList) {
			bw.write(data + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
