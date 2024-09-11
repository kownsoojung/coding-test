package 단계.일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 분수찾기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int line = 1;
		int cnt = 0;
		
		while (true) {
			if (num <= line + cnt) {
				break;
			}
			cnt+= line;
			line++;
		}
		
		int a = num - cnt;
		
		if (line%2 == 0) {
			bw.write(a + "/" + (line - a + 1));
		}
		else {
			bw.write((line - a + 1) + "/" + a);
		}
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
