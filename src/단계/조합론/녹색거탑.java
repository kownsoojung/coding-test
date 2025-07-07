package 단계.조합론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 녹색거탑 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int target = Integer.parseInt(br.readLine());
		
		
		bw.write((int) (Math.pow(2, target)) + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
