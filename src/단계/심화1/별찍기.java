package 단계.심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int maxCnt = Integer.parseInt(br.readLine());
		
		maxCnt = maxCnt *2 -1;
		int forCnt = maxCnt /2;
		for (int a = 0; a <= maxCnt /2; a++) {
			if ( forCnt - a != 0 ) {
				for( int b = 0; b < forCnt -a; b++ ) {
					bw.write(" ");
				}
			}
			
			for( int b = 0; b < maxCnt - ((forCnt - a) * 2 ); b++ ) {
				bw.write("*");
			}
			
			bw.write("\n");
			
		}
		
		for (int a = maxCnt /2 -1; a >= 0; a--) {
			if ( forCnt - a != 0 ) {
				for( int b = 0; b < forCnt -a; b++ ) {
					bw.write(" ");
				}
			}
			
			for( int b = 0; b < maxCnt - ((forCnt - a) * 2 ); b++ ) {
				bw.write("*");
			}
			
			if ( a != 0) bw.write("\n");
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
