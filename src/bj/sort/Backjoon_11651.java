package bj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Backjoon_11651 {
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();

        for (int i =0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }
        list.sort((a, b)-> {
            if (a.y != b.y) return Integer.compare(a.y, b.y);
            return Integer.compare(a.x, b.y);
        }); 
        StringBuilder sb = new StringBuilder();
        for(Point p : list) {
            sb.append(p.x).append(' ').append(p.y).append('\n');
        }
        System.out.print(sb.toString());
    }
}
