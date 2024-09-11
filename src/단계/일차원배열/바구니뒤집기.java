package 단계.일차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 바구니뒤집기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		
		int[] list = new int[Integer.parseInt(temp[0])];
		
		for(int a = 1; a <= Integer.parseInt(temp[0]); a++) {
			list[a -1] = a;
		}
		
		for(int a = 0; a < Integer.parseInt(temp[1]); a++) {
			int[] sList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] copyList = list.clone();
			int cnt = sList[0] -1;
			for ( int b = sList[1] -1; b > sList[0] -1; b-- ) {
				list[b]    = copyList[cnt];
				list[b -1] = copyList[cnt +1];
				cnt++;
			}
		}
		
		String result = "";
		for(int value : list ) {
			result += value + " ";
		}
		result.trim();
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
	}
}
