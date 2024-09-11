package 단계.일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 벌집 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		int sum = 1;
		int map = 2;
		
		if (cnt != 1) { 
			while(map <= cnt ) {
				map += (sum * 6);
				sum += 1;
			}
		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
