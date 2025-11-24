package bj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Backjoon_1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            set.add(word);
        }
        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word).append('\n');
        }
        System.out.print(sb);
    }

}
