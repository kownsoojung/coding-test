package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이 {
	public static void main(String args[]) throws IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        
        int sum = 0;
        
        int no1= -1;
        int no2= -1;
        
        for(int i=0;i<9;i++) {
			int n = Integer.parseInt(br.readLine()); //값을 입력받고
			arr[i] = n; //그 값을 배열에 저장
			sum += arr[i]; //키 총합 누적합산
		}
        
        Arrays.sort(arr);
        
        for ( int a = 0; a < arr.length; a++ ) {
        	for ( int b = a +1; b < arr.length; b++ ) {
        		if ( sum - arr[a] - arr[b] == 100 ) {
            		no1 = a;
            		no2 = b;
            		break;
            	}
            }
        }
        
        for ( int a = 0; a < arr.length; a++ ) {
        	if ( !(a == no1 || a == no2) ) {
        		System.out.println(a);
        	}
        }
	
	}
}
