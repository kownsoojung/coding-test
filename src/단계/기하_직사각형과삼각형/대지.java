package 단계.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대지 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		int[][] list = new int[cnt][2];
		
		
		for (int a = 0; a < cnt; a++) {
			String[] jum = br.readLine().split(" ");
			list[a][0] = Integer.parseInt(jum[0]);
			list[a][1] = Integer.parseInt(jum[1]);
		}
		
		int minX = list[0][0];
		int maxX = list[0][0];
		
		int minY = list[0][1];
		int maxY = list[0][1];
		
		if (cnt == 1) System.out.println(0);
		else {
			for (int a = 1; a < cnt; a++) {
				if ( minX > list[a][0] ) minX = list[a][0];
				if ( maxX < list[a][0] ) maxX = list[a][0];
				
				if ( minY > list[a][1] ) minY = list[a][1];
				if ( maxY < list[a][1] ) maxY = list[a][1];
			}
			
			System.out.println( ( maxX - minX) * (maxY - minY) );
		}
		
		br.close();
	}
}
