package 단계.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 수_정렬하기3 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		
		int[] list = new int[cnt];
		
		for (int a = 0; a < cnt; a++) {
			list[a] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(list);
		
		for (int i : list) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
