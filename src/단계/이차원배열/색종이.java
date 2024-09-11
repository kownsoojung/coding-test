package 단계.이차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 색종이 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		boolean[][] list = new boolean[100][100];
		
		int tot = 0;
		for (int test = 0; test < cnt; test++) {
			int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			for (int a = temp[0]; a < temp[0] + 10; a++) {
				for (int b = temp[1]; b < temp[1] + 10; b++) {
					if (list[a-1][b-1] != true) {
						tot++;
						list[a-1][b-1] = true;
					}
				}
			}
		}
		
		bw.write(tot + "");
		bw.flush();
		bw.close();
		br.close();
	}
}
