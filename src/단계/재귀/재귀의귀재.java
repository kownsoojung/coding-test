package 단계.재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 재귀의귀재 {
	
	static int isPalind = 1;
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int cnt = Integer.parseInt(br.readLine());
		
		
		for (int a = 0; a < cnt; a++) {
			String data = br.readLine();
			isPalind = 1;
			int result = isPalindrome(data, 0);
			
			bw.write(isPalind +" "+ result +"\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}

	private static int isPalindrome(String data, int i) {
		
		int cnt = i;
		if (data.length() <= 1 ) {
			return cnt+1;
		}
		else {
			if (data.charAt(0) != data.charAt(data.length() -1 )) {
				isPalind = 0;
				return cnt+1;
			}
		}
		
		return isPalindrome(data.substring(1, data.length() -1), cnt+1);
		
	}
}
