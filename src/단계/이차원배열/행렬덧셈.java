package 단계.이차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 행렬덧셈 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] cnt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] a = new int[cnt[0]][cnt[1]];
		int[][] b = new int[cnt[0]][cnt[1]];
		
		
		for (int i = 0; i < cnt[0]; i++) {
			a[i] =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		for (int i = 0; i < cnt[0]; i++) {
			b[i] =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		for (int i = 0; i < cnt[0]; i++) {
			String rValue = "";
			for(int z = 0; z <cnt[1]; z++) {
				rValue += a[i][z] + b[i][z] + " ";
			}
			rValue.trim();
			bw.write(rValue + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
