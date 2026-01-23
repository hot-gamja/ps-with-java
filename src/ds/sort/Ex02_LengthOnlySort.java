package ds.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02_LengthOnlySort {
    public static void main(String[] args) {
        String[] arr = {"it", "i", "love", "java", "hi"};

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });
        System.out.println("결과 : " + Arrays.toString(arr));        
    }
}
