package bj.stack_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_2493 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] stackIdx = new int[n];
        int[] stackH = new int[n];
        int top = -1;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int h = Integer.parseInt(st.nextToken());

            while (top >= 0 && stackH[top] < h){
                top--;
            }
            int response = (top == -1) ? 0 : stackIdx[top];
            sb.append(response);
            if (i < n) {
                sb.append(' ');
            }
            stackIdx[++top] = i;
            stackH[top] = h;
        }
        System.out.print(sb);
    }

}
