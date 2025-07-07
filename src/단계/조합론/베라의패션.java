package 단계.조합론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 베라의패션 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int target = Integer.parseInt(br.readLine());
		
		
		bw.write(target * (target -1) + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
