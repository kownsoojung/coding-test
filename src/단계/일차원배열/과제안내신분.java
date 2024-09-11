package 단계.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 과제안내신분 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] personList = new int[30];
	
		for(int a = 1; a <= 30; a++) {
			personList[a -1] = a;
		}
		for(int a = 1; a <= 28; a++) {
			int value = Integer.parseInt(br.readLine());
			personList[value -1] = 99;
		}
		
		Arrays.sort(personList);
		for ( int a : personList ) {
			if ( a == 99 ) break;
			bw.write(a + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
