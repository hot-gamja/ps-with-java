package bj.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_10811 {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=i+1;
        }
        for(int k=0; k<m; k++){
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            arr[i-1]
        }

    }
}
