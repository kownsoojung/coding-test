package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 설탕배달 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int N= Integer.parseInt(br.readLine());
	    
	    int count = 0;
        while (N > 0) {
            if ( N % 5 == 0 ) {
            	
            	count += N / 5;
            	System.out.println(count);
            	return;
            }
            
            if ( N < 3 ) {
            	System.out.println(-1);
            	return;
            }
            
            N -=3;
            count++;
        }
        System.out.println(count);
	    
	    bw.close();
	}
}
