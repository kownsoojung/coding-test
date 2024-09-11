package 단계.입출력과사칙연산;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SACHIQYEANSAN {
	public static void main(String args[]) throws IOException {
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String[] ab = br.readLine().split(" ");
			
		    int a = Integer.parseInt(ab[0]);
		    int b = Integer.parseInt(ab[1]);
		    
		    br.close();
		    
		    System.out.println(a+b);
		    System.out.println(a-b);
		    System.out.println(a*b);
		    System.out.println(a/b);
		    System.out.println(a%b);
		}
	}

