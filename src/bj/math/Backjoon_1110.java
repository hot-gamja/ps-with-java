package bj.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int original = N;
        int cur = N;
        int count = 0;

        while (true) {
            int a = cur / 10;
            int b = cur % 10;
            int sum = a + b;
            int next = b * 10 + (sum % 10);

            cur = next;
            count++;

            if (cur == original) {
                break;
            }
        }
        System.out.println(count);
    }
}
