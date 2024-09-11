package 단계.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알람시계 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String[] ab = br.readLine().split(" ");
		int h = Integer.parseInt(ab[0]);
		int m = Integer.parseInt(ab[1]);
		
		int mm = m - 45;
		int rH = h;
		int rM = 0;
		if ( mm < 0 ) {
			rM = 60 + mm;
			rH = h -1;
			
			if (rH < 0) rH = 23;
		}
		else {
			rM = m - 45;
		}
		
		System.out.println(rH +  " " + rM);
		
	}	
}		
