package 단계.심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 그룹단어체커 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int cnt = Integer.parseInt(br.readLine());
		
		int result = 0;
		for (int a = 0; a < cnt; a++) {
			if (check(br.readLine()) ) {
				result++;
			}
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean check(String text) {
		
		boolean check[] = new boolean[26];
		
		int prev = -1; 
		for( int a = 0; a < text.length(); a++ ) {
			int now = text.charAt(a);
			if (prev != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}
		
		return true;
	}
}
