package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 분수합 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int b[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int up = (a[0] * b[1]) + (b[0] * a[1]);
		int down = a[1] * b[1];
		
		
		int max = 1;
		for (int i = 1; i <= up && i <=down; i++) {
			if (up %i == 0 && down % i == 0) {
				max = i;
			}
		}
		
		
		
		bw.write(up/max + " " + down/max);
		
		bw.flush();
		br.close();
		bw.close();
	}
}
