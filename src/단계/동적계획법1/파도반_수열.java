package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 파도반_수열 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n  = Integer.parseInt(br.readLine());
		Long[] kList = new Long[101];
		kList[0] = 0L;
		kList[1] = 1L;
		kList[2] = 1L;
		kList[3] = 1L;
		kList[4] = 2L;
		kList[5] = 2L;
		kList[6] = 3L;
		kList[7] = 4L;
		kList[8] = 5L;
		kList[9] = 7L;
		kList[10] = 9L;
		for (int a = 11; a <= 100; a++) {
			kList[a] = kList[a-1] +  kList[a-5]; 
		}
		
		for (int a = 0; a < n; a ++) {
			int k  = Integer.parseInt(br.readLine());
			System.out.println(kList[k]);
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
