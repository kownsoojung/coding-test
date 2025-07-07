package 단계.재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 별찍기 {
	
	static StringBuilder sb = new StringBuilder();

	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				star(i,j,n);
			}
			sb.append("\n");
			
		}
		System.out.println(sb);
		
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static void star(int i, int j, int n) {
		if((i/n) % 3 == 1 && (j/n) % 3 == 1){
           sb.append(' ');
        }
        else{
            if(n==1) sb.append('*');
            else star(i, j, n/3);
        }
	}
}
