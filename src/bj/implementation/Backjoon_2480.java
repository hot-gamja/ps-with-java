package bj.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Backjoon_2480 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList();
        for(int i=0; i<3; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        if(list.get(0)==list.get(1)){
            if(list.get(0)==list.get(2)){
                System.out.println(10000+(list.get(0)*1000));
            }else System.out.println(1000+list.get(0)*100);
        }else if(list.get(0)==list.get(3)){
            System.out.println(1000+list.get(1)*100);
        }else if(list.get(1)==list.get(2)){
            System.out.println(1000+list.get(0)*100);
        }else {
            Collections.sort(list);
            System.out.println(list.get(2)*100);
        }
        
    }
    
}
