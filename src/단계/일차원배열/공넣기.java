package 단계.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 공넣기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		
		int[] list = new int[Integer.parseInt(temp[0])];
		
		
		for(int a = 0; a < Integer.parseInt(temp[1]); a++) {
			int[] sList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			
			for (int b = sList[0] -1; b < sList[1]; b++) {
				list[b] = sList[2];
			}
		}
		
		String result = "";
		for(int value : list ) {
			if ( Integer.toString(value).isBlank() ) result += 0 + " ";
			else result += value + " ";
		}
		result.trim();
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
	}
}
