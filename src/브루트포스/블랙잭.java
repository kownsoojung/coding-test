package 브루트포스;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 블랙잭 {
	
	public static void main(String args[]) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] l1 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] l2 = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        
        br.close();
        
        int temp = 0;
        int result = 0;
		for (int a = 0; a < l1[0]; a++) {
			for (int b = a+1; b < l1[0]; b++) {
				for (int c = b+1; c < l1[0]; c++) {
					temp = l2[a] +l2[b] + l2[c];
					
					if ( temp <= l1[1] && temp > result) {
						result = temp;
					}
				}
			}
		}
		
		
        bw.close();
	}
}
