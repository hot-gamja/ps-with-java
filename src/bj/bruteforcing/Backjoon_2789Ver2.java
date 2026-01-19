package bj.bruteforcing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_2789Ver2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        int best = 0;
        for (int i = 0; i <N ; i++) {
            for(int j = i+1; j <N-1; j++){
                for(int k = j+1; k < N-2 ; k++){
                    int sum = cards[i] + cards[j] + cards[k];
                    
                    if(sum<=M&&best<sum){
                        best=sum;
                    }
                }
            }
        }
        System.out.println(best);
    }
}
