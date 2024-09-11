package 단계.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 직사각형에서탈출 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int w = temp[0];
		int h = temp[1];
		int x = temp[2];
		int y = temp[3];
		
		int min = 0;
				
		if ( x - w > w ) {
			min = w;
		}
		else {
			min = x-w;
		}
		if ( y - h > h && min > h ) {
			min = h;
		}
		else if ( y - h < h && min > y - h ) {
			min = y - h;
		}
		
		bw.write(min + "");
		bw.flush();
		br.close();
		bw.close();
	}
}
