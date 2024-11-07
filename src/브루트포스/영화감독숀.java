package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 영화감독숀 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int inputData= Integer.parseInt(br.readLine());
	    int cnt = 0;
	    int rValue = 0;
	    
	    while (inputData != cnt) {
			rValue++;
			
			if ( Integer.toString(rValue).contains("666") ) {
				cnt++;
			}
		}
	    
	    System.out.println(rValue);
	    bw.close();
	}
}
