package 단계.누적합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 체스판_다시_칠하기2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nmk  = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = nmk[0];
		int m = nmk[1];
		
		int k = nmk[2];
		
		String[][] arr = new String[n+1][m+1];
		
		for (int a = 0; a < m; a++ ) {
			arr[a+1] = String.join(" ", br.readLine()).split("");
		}
        
		int[][] bArr = new int [n+1][m+1];
		int[][] wArr = new int [n+1][m+1];
		
		
		for (int a = 1; a <=n; a++) {
			for (int b = 1; b <=m; b++) {
				String data =arr[a][b];
				if (a/2 == 1) {
					if (b == 0) {
						wArr[a][b] = wArr[a-1][m];
						bArr[a][b] = bArr[a-1][m];
						if (data == "B") wArr[a][b] = wArr[a-1][m] + 1;
						else bArr[a][b] = bArr[a][n-1] + 1;
					}
					else if ( b/2 == 0){
						wArr[a][b] = wArr[a][b-1];
						bArr[a][b] = bArr[a][b-1];
						if (data == "B") wArr[a][b] = wArr[a][b-1] + 1;
						else wArr[a][b] = bArr[a][b-1] + 1;
					}
					else {
						wArr[a][b] = wArr[a][b-1];
						bArr[a][b] = bArr[a][b-1];
						if (data == "B") bArr[a][b] = bArr[a][b-1] + 1;
						else wArr[a][b] = wArr[a][b-1] + 1;
					}
				}
				else {
					if (b == 0) {
						wArr[a][b] = wArr[a-1][m];
						bArr[a][b] = bArr[a-1][m];
						if (data == "W") wArr[a][b] = wArr[a-1][m] + 1;
						else bArr[a][b] = bArr[a][n-1] + 1;
					}
					else if ( b/2 == 0){
						wArr[a][b] = wArr[a][b-1];
						bArr[a][b] = bArr[a][b-1];
						if (data == "W") wArr[a][b] = wArr[a][b-1] + 1;
						else wArr[a][b] = bArr[a][b-1] + 1;
					}
					else {
						wArr[a][b] = wArr[a][b-1];
						bArr[a][b] = bArr[a][b-1];
						if (data == "W") bArr[a][b] = bArr[a][b-1] + 1;
						else wArr[a][b] = wArr[a][b-1] + 1;
					}
				}
			}
		}
		
		
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
