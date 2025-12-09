package 단계.동적계획법2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 파일_합치기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		//int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream("1 21 3 4 5 35 5 4 3 5 98 21 14 17 32".split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr);

		bw.flush();
		br.close();
		bw.close();
	}
}
