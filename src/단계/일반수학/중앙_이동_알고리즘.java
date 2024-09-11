package 단계.일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 중앙_이동_알고리즘 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int box = 1;
		
		for (int a = 1; a <= cnt; a++) {
			box = box *2;
		}
		
		int jum = ( box +1 ) * ( box +1 );
		
		System.out.println(jum);
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
