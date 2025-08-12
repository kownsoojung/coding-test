package 단계.백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 연산자끼어넣기 {
	
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n  = Integer.parseInt(br.readLine());
		int[] numList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] operator = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		dp(numList[0], 1,  numList, operator);
		
		
		System.out.println(max);
		System.out.println(min);
		bw.flush();
		br.close();
		bw.close();
	}

	private static void dp(int num, int n, int[] numList, int[] operator) {
		
		if (n == numList.length) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		for (int a = 0; a < operator.length ; a++) {
			int todoNum = num;
			if (operator[a] > 0 ) {
					switch (a) {
					case 0: {
						todoNum +=numList[n];
						break;
					}
					case 1: {
						todoNum -=numList[n];		
						break;
					}
					case 2: {
						todoNum *=numList[n];
						break;
					}
					case 3: {
						todoNum /=numList[n];
						break;
					}
				}
				
				operator[a] = operator[a] -1;
				dp(todoNum, n+1,  numList, operator);
				operator[a] = operator[a] +1;
			}
		}
			
	}

}
