package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 최소공배수_2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		long[] tList= Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		
		long n = eucd(Math.max(tList[0], tList[1]), Math.min(tList[0], tList[1]));

		bw.write((tList[0] * tList[1]) / n + "");
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static long eucd(long max, long min) {
		long r = max % min;
		
		if (r == 0 ) return min;
		else return eucd(min, r);
	}

}
