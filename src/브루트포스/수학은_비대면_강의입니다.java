package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 수학은_비대면_강의입니다 {
	public static void main(String args[]) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        
        for (int x = -999; x <=999; x++) {
        	for (int y = -999; y <=999; y++) {
        		if ( list[0] * x + list[1] * y == list[2] 
        				&& list[3] * x + list[4] * y == list[5] )
        		{
        			System.out.println(x + " " + y);
        		}
            	
            }
        }
        
        
        bw.close();
	}
}
