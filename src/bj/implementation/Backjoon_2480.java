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
        int a= list.get(0);
        int b= list.get(1);
        int c= list.get(2);
        int prize = 0;
        if(a==b && b==c ){
           prize = 10000+a*1000;
        }else if(a==b || a==c ){
            prize = 1000+a*100;
        }else if(b==c){
            prize = 1000+b*100;
        }else {
            Collections.sort(list);
            prize = list.get(2)*100;
        }
        System.out.println(prize);
        
    }
    
}
