package 단계.심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 체스_킹퀸룩비숍나이트폰 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		String returnValue = "";
		int a = 1;
		for (int i : list) {
			int n;
			if ( a == 1 || a == 2) n = 1;
			else if ( a == 3 || a == 4 || a == 5 ) n = 2;
			else  n = 8;
			returnValue += (n - i) + " ";
			a++;
		}
		
		returnValue.trim();
		bw.write(returnValue);
		
		bw.flush();
		br.close();
		bw.close();
	}
}
