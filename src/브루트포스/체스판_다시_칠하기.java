package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 체스판_다시_칠하기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    
	    int n = list[0];
	    int m = list[1];
	    
	    String[][] chs= new String[n][m];
	    for (int a = 0; a <n; a++) {
	    	chs[a] =  br.readLine().split("");
	    }
	    
	    int min = 64;
	    
	    for(int i = 0 ; i < n - 7 ; i++) { // 세로의 경우의 수
			for(int j = 0 ; j < m - 7 ; j++) { // 가로의 경우의 수 
				min = Math.min(min, setCount(chs, "W",i, j)); // 최소값을 저장
				min = Math.min(min, setCount(chs, "B",i, j)); // 최소값을 저장
			}
		}
	    
	    
	    System.out.println(min);
	    
	    bw.close();
	}

	private static int setCount(String[][] chs, String color, int i, int j) {
		
		String data = color;
		int cnt = 0;
		
		for (int a = i; a <i + 8; a++) {
	    	
	    	for (int b = j; b < j + 8; b++) {
	    		
	    		if ( !chs[a][b].equals(data) ) {
	    			cnt++;
	    		}
	    		if ( "W".equals(data) ) data = "B";
	    		else data = "W";
	    		
	    	}
	    	
	    	if ( "W".equals(data) ) {
	    		data = "B";
    		}
    		else data = "W";
	    }
		
		return cnt;
	}
}
