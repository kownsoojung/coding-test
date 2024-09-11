package 단계.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오븐_시계 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String[] ab = br.readLine().split(" ");
		int time 	= Integer.parseInt(br.readLine());
		
		br.close();
		
		int h = Integer.parseInt(ab[0]);
		int m = Integer.parseInt(ab[1]);
		
		int mm = m + time;
		int rH = h;
		int rM = 0;
		if ( mm / 60 > 0 ) {
			rM = mm % 60;
			
			
			rH = h + (mm / 60);
			
			if (rH >= 24) rH = rH % 24;
		}
		else {
			rM = mm;
		}
		
		
		
		System.out.println(rH +  " " + rM);
		
	}	
}
