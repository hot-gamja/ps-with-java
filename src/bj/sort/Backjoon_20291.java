package bj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Backjoon_20291 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String ext = line.substring(line.lastIndexOf('.') + 1);

            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }
        ArrayList<String> exts = new ArrayList<>(map.keySet());
        Collections.sort(exts);

        StringBuilder sb = new StringBuilder();
        for (String ext : exts) {
            sb.append(ext).append(' ').append(map.get(ext)).append('\n');
        }
        System.out.print(sb.toString());
    }
}
