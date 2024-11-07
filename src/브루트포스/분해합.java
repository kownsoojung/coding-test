package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 분해합 {
	public static void main(String args[]) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int a = 1; a <=cnt; a++) {
        	sum = a;
        	
        	int num = a;
        	
        	while (num > 0) {
        		sum += num % 10;
        		num = num / 10;
			}
        	
        	if ( sum == cnt ) {
        		System.out.println(a);
        		break;
        	}
        }
		
		
        if (sum != cnt) System.out.println(0);
        
        bw.close();
	}
}
