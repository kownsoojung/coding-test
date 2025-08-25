package 단계.동적계획법1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 일로만들기 {
	static int min = Integer.MAX_VALUE;
    static boolean isTrue = false;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());

		if (n == 1) {
			System.out.println(0);
			return;
		}
		
		dp(n, 0);
		
		System.out.println(min);
		
		bw.flush();
		br.close();
		bw.close();
	}
    
    public static void dp(int n, int cnt) {
        
    	if ( isTrue && cnt > min  ) return;
        if (n == 1) {
            min = Math.min(cnt, min);
            isTrue = true;
            return;
        }
        
        if ( n%3 == 0 ) dp(n/3, cnt+1);
        if ( n%2 == 0 ) dp(n/2, cnt+1);
        dp(n-1, cnt+1);
        
    }

}
