package bj.set_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Backjoon_1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] numToName = new String[N + 1];
        HashMap<String, Integer> nameToNum = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            numToName[i] = name;
            nameToNum.put(name, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String q = br.readLine();

            if (q.charAt(0) >= '0' && q.charAt(0) <= '9') {
                int idx = Integer.parseInt(q);
                sb.append(numToName[idx]).append('\n');
            } else {
                sb.append(nameToNum.get(q)).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}
