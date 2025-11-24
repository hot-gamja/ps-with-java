package bj.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;
//import java.util.*;

public class Backjoon_1032_ver2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int len = arr[0].length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char first = arr[0].charAt(i);
            boolean same = true;

            for (int j = 0; j < n; j++) {
                if (arr[j].charAt(i) != first) {
                    same = false;
                    break;
                }
            }
            if (same)
                sb.append(first);
            else
                sb.append('?');
        }

    }
}