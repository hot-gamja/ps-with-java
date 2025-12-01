package bj.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_2588 {
    public static void main(String[] arrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        String s2 = br.readLine();
        int Ints2 = Integer.parseInt(s2);

        int c1 = s2.charAt(0) - '0'; // 100
        int c2 = s2.charAt(1) - '0'; // 10
        int c3 = s2.charAt(2) - '0'; // 1

        int[] result = new int[4];
        result[0] = s * c3;
        result[1] = s * c2;
        result[2] = s * c1;
        result[3] = s * Ints2;

        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }

    }
}
