package bj.set_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Backjoon_1764 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> checkN = new HashSet<>();
        for (int i = 0; i < N; i++) {
            checkN.add(br.readLine());
        }
        HashSet<String> result = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (checkN.contains(s)) {
                result.add(s);
            }
        }
        List<String> list = new ArrayList<>(result);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String name : list) {
            sb.append(name).append('\n');
        }
        System.out.println(list.size());
        System.out.print(sb.toString());
    }
}
