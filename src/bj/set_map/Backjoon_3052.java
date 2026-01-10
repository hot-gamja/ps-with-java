package bj.set_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Backjoon_3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine());
            set.add(x % 42);
        }
        System.out.println(set.size());
    }
}
