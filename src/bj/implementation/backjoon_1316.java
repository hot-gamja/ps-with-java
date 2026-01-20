package bj.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class backjoon_1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] group = new String [n];
        for (int i = 0; i < n; i++) {
            group[i] = br.readLine();
        }
        
    }
}
