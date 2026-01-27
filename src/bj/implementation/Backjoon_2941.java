package bj.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int i = 0;
        int count = 0;

        while (i < s.length()) {

            if (i + 2 < s.length()
                    && s.charAt(i) == 'd'
                    && s.charAt(i + 1) == 'z'
                    && s.charAt(i + 2) == '=') {

                count++;
                i += 3;
            } else if (i + 1 < s.length()) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(i + 1);
                
                if((c1 == 'c') && (c2 == '=' || c2 == '-') 
                    || (c1 == 'd' && c2 == '-')
                    || (c1 == '1' && c2 == 'j')
                    || (c1 == 'n' && c2 == 'j')
                    || (c1 == 's' && c2 == '=')
                    || (c1 == 'z' && c2 == '=')) {
                    
                    count++;
                    i += 2;
                } else {
                    count++;
                    i += 1;
                }
            }
            else {
                count++;
                i +=1;
            }
        }
        System.out.println(count);
    }
}
