package 단계.집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 듣보잡 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		HashMap<String, Integer> nMap = new HashMap<String, Integer>();
		
		int rSum = 0;
		ArrayList<String> rList = new ArrayList<String>();
		
		for (int a = 0; a < nm[0]; a++) {
			nMap.put(br.readLine(), 0);
		}
		
		
		for (int a = 0; a < nm[1]; a++) {
			String mName = br.readLine();
			
			if ( nMap.containsKey(mName) ) {
				rSum++;
				rList.add(mName);
			}
		}
		
		Collections.sort(rList);
		
		bw.write(rSum + "\n");

		for (String rName : rList) {
			bw.write(rName + "\n");
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
