package bj.implementation;

import java.io.*;
import java.util.*;

public class Backjoon_1032 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(br.readLine());
        }

        int len = list.get(0).length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<len; i++){
            char first = list.get(0).charAt(i);
            boolean same = true;

            for(int j=1; j<N; j++){
                if(list.get(j).charAt(i) != first){
                    same = false;
                    break;
                }
            }
            sb.append(same ? first : '?');
        }
        System.out.println(sb.toString());

    }
}