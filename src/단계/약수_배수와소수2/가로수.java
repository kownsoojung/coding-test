package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 가로수 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int nList[] = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			nList[i] = Integer.parseInt(br.readLine());
		}
		
		int gcd = 0;
		
		for (int i = 1; i < n; i++) {
			gcd = findGcd(nList[i] - nList[i -1], gcd);
		}
		
		int rtnVal = (nList[n - 1] - nList[0]) / gcd +1 -n;
		bw.write(rtnVal + "");
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static int findGcd(int i, int gcd) {
		
		if ( gcd == 0 ) return i;
	
		return findGcd(gcd, i % gcd);
	}
}
