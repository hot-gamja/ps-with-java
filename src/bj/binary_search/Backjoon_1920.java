package bj.binary_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon_1920 {
    public static void main(String[] ars) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arrN = new int[N];
        int[] arrM = new int[M];

        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<M; i++){
            arrM[M] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arrN);
    }
}
