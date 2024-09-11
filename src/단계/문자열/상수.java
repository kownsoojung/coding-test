package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 상수 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		String[] list =  br.readLine().split(" ");
		String[] a = list[0].split("");
		String[] b = list[1].split("");
		
		int rA = Integer.parseInt(a[2] + a[1] + a[0]);
		int rB = Integer.parseInt(b[2] + b[1] + b[0]);
		
		if ( rA < rB ) bw.write(rB + "");
		else bw.write(rA + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
