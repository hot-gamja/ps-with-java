package bj.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_2675 {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());               
            String s = st.nextToken();
            
            for (int j= 0; j<s.length(); j++) {
                char c = s.charAt(j);
                for (int k = 0; k < a; k++) {
                    sb.append(c);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}

