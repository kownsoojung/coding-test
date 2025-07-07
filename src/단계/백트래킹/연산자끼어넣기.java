package 단계.백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 연산자끼어넣기 {
	
	public static int max = 0;
	public static int min = 99999999;
	public static int n;
	public static int[] arr;
	public static int[] map = new int[4];
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		map = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		dfs(arr[0], 1);
		
		bw.write(max + "\n");
		bw.write(min + "");
		bw.flush();
		br.close();
		bw.close();
	}
	private static void dfs(int num, int index) {
		
		if (index == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			
			return;
		}
		
		for (int a = 0; a < 4; a ++) {
			if ( map[a] > 0 ) {
				map[a]--;
				
				switch (a) {

                case 0: //더하기일 경우
                	dfs(num + arr[index], index + 1);
                    break;
                case 1: //빼기일 경우
                	dfs(num - arr[index], index + 1);
                    break;
                case 2: //곱하기일 경우
                	dfs(num * arr[index], index + 1);
                    break;
                case 3: //나누기일 경우
                	dfs(num / arr[index], index + 1);
                    break;

            }
            // 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
            map[a]++;
				
			}
		}
	}
}
