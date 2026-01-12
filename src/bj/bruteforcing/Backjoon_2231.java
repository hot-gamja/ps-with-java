package bj.bruteforcing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_2231 {
    static int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int m = 1; m <= N; m++) {
            int sum = m + digitSum(m);
            if (sum == N) {
                System.out.println(m);
                return;
            }
        }
        System.out.println(0);
    }

}
