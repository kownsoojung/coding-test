package 단계.이차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 세로읽기 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[][] list = new String[5][15];
		
		StringBuilder rValue= new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			String[] line =  br.readLine().split("");
			for ( int a =0; a < line.length; a++ ) {
				list[i][a] = line[a];
			}
		}
		
		for (int a = 0; a < list[0].length; a++) {
			for (int b = 0; b < list.length; b++) {
				if (!(list[b][a] == null)) rValue.append( list[b][a]);
			}
		}
		
		bw.write(rValue.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
