package 단계.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class 주사위_세개 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int[] list =  Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		br.close();
		
		for (int cnt : list) {
			map.put(cnt, map.getOrDefault(cnt, 0) + 1);
		}
		
		
		int dupCnt = 1;
		int rValue = 0;

		for (int key : map.keySet()) {
		    int value = map.get(key);
		    System.out.println(value);
		    if ( value == dupCnt ) {
		    	if (rValue < key ) rValue = key;
		    }
		    else {
		    	dupCnt = value;
		    	rValue = key;
		    	
		    	break;
		    }
		}
		
		if (dupCnt == 3) System.out.println(10000 + (rValue * 1000));
		else if (dupCnt == 2) System.out.println(1000 + (rValue * 100));
		else System.out.println(rValue * 100);
		
	}	
}
