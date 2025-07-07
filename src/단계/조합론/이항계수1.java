package 단계.조합론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 이항계수1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int n = nk[0];
		int k = nk[1];
		
		int rtnValue = fact(n) / (fact(k) * fact(n - k));
		
		bw.write(rtnValue + "");
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static int fact(int i) {

		int result = 1;
		for (int a = 2; a <=i; a++) {
			result = result* a;
		}
		return result;
	}
}
