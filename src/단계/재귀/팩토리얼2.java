package 단계.재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팩토리얼2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		
		
		long result = 1;
		
		if (cnt > 1 ) {
			for (int a = 2; a <= cnt; a++) {
				result = result * a;
			}
		}
		
			
		bw.write(result + "");
			
		bw.flush();
		br.close();
		bw.close();
	}
}
