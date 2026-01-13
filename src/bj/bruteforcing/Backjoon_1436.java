package bj.bruteforcing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_1436 {

    static boolean isDevil(int num){
        String s = String.valueOf(num);
        return s.contains("666");
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int num =0;

        while(true){
            num++;

            if(isDevil(num)){
                count++;
            }
            if(count == N){
                System.out.println(num);
                break;
            }

        }

    }
}
