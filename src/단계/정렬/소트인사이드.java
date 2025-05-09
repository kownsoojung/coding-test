package 단계.정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String[] cnt = br.readLine().split("");
		
		Arrays.sort(cnt, Collections.reverseOrder());
		
		for (String i : cnt) {
			bw.write(i + "");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
