package bj.set_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Backjoon_32978 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; i++){
            String s = br.readLine();
            if(set.contains(s)){
                set.remove(s);
            }
        }
        System.out.print(sb.toString());
    }
}