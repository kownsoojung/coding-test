package 단계.조합론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팩토리얼 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int target = Integer.parseInt(br.readLine());
		
		if (target == 0) bw.write(1 + "");
		else {
			
			int fat= 1; 	
			for(int a = 2; a <= target; a++  ) {
				fat = fat * a;
			}
			
			bw.write(fat + "");
		}
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
