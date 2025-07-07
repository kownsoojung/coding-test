package 단계.재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치수5 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		
		if (cnt == 0) bw.write(0 + "");
		else if (cnt == 1) bw.write(1 + "");
		else {
			int result = pi(cnt, 0, 1, 1);
			bw.write(result + "");
		}

		bw.flush();
		br.close();
		bw.close();
	}

	private static int pi(int cnt, int i, int j, int re) {
		
		if (re == cnt) return j;
		else {
			re++;
			return pi(cnt,j, i + j, re);
		}
	}
}
