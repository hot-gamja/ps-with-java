package bj.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class backjoon_10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] pos = new int[26];
        Arrays.fill(pos, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a'; //0~25

          if(pos[idx] == -1){
            pos[idx] = i;
          }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            sb.append(pos[i]).append(" ");
        }
        System.out.println(sb.toString().trim());


    }
}
