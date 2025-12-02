package bj.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Backjoon_2751 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }
    //              < list >
    //     System.out.print(sb.toString());
    //     ArrayList<Integer> list = new ArrayList<>();
	// 	for(int i = 0; i < n; i++) {
	// 		list.add(in.nextInt());
	// 	}
	// 	Collections.sort(list);
	// 	for(int value : list) {
	// 		sb.append(value).append('\n');
	// 	}
	// 	System.out.println(sb);
	// }
    

        /* Time out */

        // List<Integer>list =new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     list.add(Integer.parseInt(br.readLine()));
        // }
        // list.stream().sorted().forEach(System.out::println);

    //     int [] arr = new int[n];
    //     for(int i=0; i<n; i++){
    //         arr[i] = Integer.parseInt(br.readLine());
    //     }
    //     Arrays.sort(arr);
    //    for (int i = 0; i < n; i++) {
    //         System.out.println(arr[i]);
    //     }
    }
    
}
