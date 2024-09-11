package 단계.일반수학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 달팽이는_올라가고싶다 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int end = list[2] - list[1];
		int day = list[0] - list[1];
		if (end % day == 0 ) bw.write((end / day) + "");
		else  bw.write(((end / day) + 1) + "");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
