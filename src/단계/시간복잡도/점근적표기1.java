package 단계.시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 점근적표기1 {
	//https://www.acmicpc.net/status?user_id=izi1235&problem_id=24313&from_mine=1
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int[] numList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int a1 = numList[0];
		int a0 = numList[1];
		int c  = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
		if ( a1 * n0 + a0 <=  c * n0 && (a1 <= c)) {
			System.out.println(n0);
		}
		else {
			System.out.println(0);
		}
		
		br.close();
	}
}
