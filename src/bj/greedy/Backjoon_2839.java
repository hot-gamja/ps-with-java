package bj.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_2839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = Integer.MAX_VALUE;

        for (int x = 0; x <= N / 5; x++) {
            for (int y = 0; y <= N / 3; y++) {
                int weight = 5 * x + 3 * y;
                if (weight == N) {
                    int bags = x + y;
                    if (bags < answer) {
                        answer = bags;
                    }
                }
            }
        }

        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

    }
}
