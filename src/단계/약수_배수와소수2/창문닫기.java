package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 창문닫기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		int cnt = 0;
		for(int a = 1; a*a <= n; a++) {
			cnt++;
		}
		
		
		bw.write(cnt + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
