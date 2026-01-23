package ds.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04_SortAndRemoveDuplicatesByPrev {
    private static void printUniqueByPrev(String[] sortedArr) {
        String prev = null;
        for (String s : sortedArr) {
            if (prev == null || !s.equals(prev)) {
                System.out.println(s);
                prev = s;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = { "but", "i", "wont", "hesitate", "no", "no", "more", "more" };

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
        Arrays.sort(a2, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        Arrays.sort(a3,
                Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()));
        System.out.println("== 1) 익명 클래스 결과(중복 제거 출력) ==");
        printUniqueByPrev(a1);

        System.out.println("\n== 2) 람다식 결과(중복 제거 출력) ==");
        printUniqueByPrev(a2);

        System.out.println("\n== 3) 체이닝 결과(중복 제거 출력) ==");
        printUniqueByPrev(a3);
    }
}
