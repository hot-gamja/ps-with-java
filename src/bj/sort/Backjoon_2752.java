package bj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Backjoon_2752 {
    // public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     // List<Integer> list = new ArrayList<>();
    //     // for(int i=0; i<n; i++){
    //     //     list.add(Integer.parseInt(br.readLine()));
    //     // }
    //     // list.stream().sorted().forEach(System.out::println);

    //     int[] arr = new int[n];

    //     for(int i=0; i<n; i++){
    //         arr[i] = Integer.parseInt(br.readLine());
    //     }

    //     Arrays.sort(arr);
    //     for(int i=0; i<n; i++){
    //         System.out.println(arr[i]);
    //     }
        

    // }
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}