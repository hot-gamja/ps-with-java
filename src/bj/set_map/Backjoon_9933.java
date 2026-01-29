package bj.set_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Backjoon_9933 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String rev = new StringBuilder(s).reverse().toString();

            if (set.contains(rev)) {
                int len = s.length();
                char mid = s.charAt(len / 2);
                System.out.println(len + " " + mid);
                return;
            }
            set.add(s);
        }
    }
}
