package 프로그래머스.깊이너비우선탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 타겟넘버 {
	
	static int answer = 0;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] nList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int target = Integer.parseInt(br.readLine());
		
		dfs(0, nList, target, 0);
		
		bw.write(answer + "");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	private static void dfs(int depth, int[] nList, int target, int sum) {
		if (depth == nList.length) {
			if (target == sum) {
				answer++;
			}
			return;
		}
			
		dfs(depth+1, nList, target, sum+nList[depth]);
		dfs(depth+1, nList, target, sum-nList[depth]);
	}
}
