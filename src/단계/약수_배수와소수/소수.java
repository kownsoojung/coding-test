package 단계.약수_배수와소수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class 소수 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		for ( int a = m; a <= n; a++ ) {
			
			if ( a <= 1 ) continue;
			boolean isSosu = true;
			for (int i = 2; i < a; i++) {
				if ( a % i == 0 ) {
					isSosu = false;
					break;
				}
			}
			
			if (isSosu) list.add(a);
		}
		
		if ( list.size() == 0 ) bw.write(-1 + "");
		else {
			
			int sum = 0;
					
			for (Integer i : list) {
				sum+=i;
			}
			
			bw.write(sum + "\n");
			bw.write(list.get(0) + "");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
