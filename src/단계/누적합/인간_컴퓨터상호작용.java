package 단계.누적합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 인간_컴퓨터상호작용 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int[][] map = new int[26][200001]; 
		
		int first = (int)s.charAt(0) - 'a';
		map[first][0] = 1;
		
		for (int i = 1; i < s.length(); i++) {
			
			int n = (int) s.charAt(i) - 'a';

			for (int a = 0; a <=25; a++) {
				if (n == a ) {
					map[a][i] = map[a][i-1] + 1;  
				}
				else {
					map[a][i] = map[a][i-1];
				}
				
			}
		}
		
		int q = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < q; i++) {
			String[] qCnt = br.readLine().split(" ");
			
			int l = Integer.parseInt(qCnt[1]);
			int r = Integer.parseInt(qCnt[2]);
			
			int[] arr = map[(int)qCnt[0].charAt(0) - 'a'];
			if (l == 0) {
                bw.write(arr[r] + "\n");
            } else {
                bw.write((arr[r] - arr[l - 1]) + "\n");
            }
			
			
			
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
