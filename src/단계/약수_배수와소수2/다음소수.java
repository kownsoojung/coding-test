package 단계.약수_배수와소수2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 다음소수 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		Long n = Long.parseLong(br.readLine());
		
		
		for (int i = 0; i < n; i++) {
			
			
			Long decimal = Long.parseLong(br.readLine());
			
			if (decimal < 2 ) {
				
				bw.write(2 + "\n");
				continue;
			}
			decimal = findDecimal(decimal);
			bw.write(decimal + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static Long findDecimal(Long decimal) {
		
		
		for (int i = 2; i <= Math.sqrt(decimal); i++) {
			if (decimal % i == 0) return findDecimal(decimal + 1);
		}
		return decimal;
	}
}
