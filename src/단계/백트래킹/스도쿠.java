package 단계.백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 스도쿠 {
	public static int[][] arr = new int[9][9];
	public static void main(String args[]) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int a = 0; a < 9; a++) {
			arr[a] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		dfs(0, 0);

		bw.flush();
		br.close();
		bw.close();
	}
	private static void dfs(int row, int col) {
		// TODO Auto-generated method stub
		
		if (col == 9) {
			dfs(row+1, 0);
			
			return;
		}
		
        //행과 열이 모두 채워졌을 경우 결과 스도쿠 출력
        if(row == 9){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append("\n");
            }

            System.out.println(sb);
            //시스템 종료
            System.exit(0);// 경우의 수가 많을 경우 '한 개'만 출력해야하기 때문 => 하나를 출력했다면 바로 시스템 종룥ㄴ
        }
		
		
		if ( arr[row][col] == 0 ) {
			for (int a = 1; a <= 9; a++) {
				if (isCheck(row, col, a)) {
					arr[row][col] = a;
					dfs(row, col+1);
				}
			}
			arr[row][col] = 0; 
			return;
		}
		
		dfs(row, col+1);
	}
	private static boolean isCheck(int row, int col, int a) {
		
		
		for (int i = 0; i < 9; i++) {
			if ( arr[row][i] == a ) {
				return false;
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if ( arr[i][col] == a ) {
				return false;
			}
		}
		
		int nRow = (row/3) * 3;
		int nCol = (col/3) * 3;
		
		for (int i = nRow; i <nRow + 3; i++) {
			for (int h = nCol; h <nCol + 3; h++) {
				if ( arr[nRow][nCol] == a ) {
					return false;
				}
			}
		}
		
		return true;
	}
}
