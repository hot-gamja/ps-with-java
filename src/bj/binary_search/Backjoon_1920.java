package bj.binary_search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon_1920 {
    static boolean binarySearch(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] ars) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);
        
        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        for (int i = 0; i < M; i++) {
            arrM[M] = Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            int x = arrM[i];
            if(binarySearch(arrN, x)) {
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
            System.out.print(sb.toString());
        }

    }
}
