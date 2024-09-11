package 단계.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class X보다작은수 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] read = br.readLine().split(" ");
		int cnt   = Integer.parseInt(read[0]);
		int value = Integer.parseInt(read[1]);
		
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		String result = "";
		for (int i : list) {
			if ( i < value ) result += Integer.toString(i) + " ";
		}
		
		result = result.trim();
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
	}
}
