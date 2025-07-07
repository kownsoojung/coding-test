package 단계.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 칸토어집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            int len = (int) Math.pow(3, n);

            char[] array = new char[len];
            for (int i = 0; i < len; i++) {
                array[i] = '-';
            }

            recursion(0, len, array);
            System.out.println(new String(array));
        }
    }

    private static void recursion(int start, int len, char[] array) {
        if (len == 1) return;

        len /= 3;  

        for (int i = start + len; i < start + 2 * len; i++) {
            array[i] = ' ';
        }

        recursion(start, len, array);
        recursion(start + 2 * len, len, array);
    }
}
