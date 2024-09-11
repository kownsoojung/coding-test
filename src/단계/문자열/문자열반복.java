package 단계.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열반복 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String[] values = br.readLine().split(" ");
            String[] textList = values[1].split("");
            StringBuilder sb = new StringBuilder();
            for (String text : textList) {
	            for( int b = 0; b < Integer.parseInt(values[0]); b++ ) {
	            	sb.append(text);
	            }
            }
            bw.write(sb + "\n");
        }

		
		bw.flush();
		br.close();
		bw.close();
	}
}

