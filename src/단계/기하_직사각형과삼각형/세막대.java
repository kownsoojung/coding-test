package 단계.기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 세막대 {
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		
		int a= Integer.parseInt(text.split(" ")[0]);
		int b= Integer.parseInt(text.split(" ")[1]);
		int c= Integer.parseInt(text.split(" ")[2]);
		int[] list = {a, b, c};
		Arrays.sort(list);
		
		int max = list[0] + list[1];
		
		if (max -1 < list[2]) {
			System.out.println(max + max -1);
		}
		else {
			System.out.println(max + list[2]);
		}
		
		br.close();
	}
}
