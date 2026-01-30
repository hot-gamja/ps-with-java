package bj.set_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Backjoon_1302 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            list.add(s);
        }
    }
}
