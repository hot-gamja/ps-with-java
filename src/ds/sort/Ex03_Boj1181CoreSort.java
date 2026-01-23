package ds.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_Boj1181CoreSort {
    public static void main(String[] args) {

        String[] arr = { "it", "i", "love", "java", "hi" };

        String[] a1 = Arrays.copyOf(arr, arr.length);
        String[] a2 = Arrays.copyOf(arr, arr.length);
        String[] a3 = Arrays.copyOf(arr, arr.length);

        Arrays.sort(a1, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }
                return a.compareTo(b);
            }
        });
        Arrays.sort(a2, (a,b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        Arrays.sort(a3,
            Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder())
        );
        System.out.println("원본(익명클래스): " + Arrays.toString(a1));
        System.out.println("람다식:        " + Arrays.toString(a2));
        System.out.println("체이닝:        " + Arrays.toString(a3));
        

    }
}
