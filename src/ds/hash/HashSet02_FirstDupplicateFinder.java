package ds.hash;

import java.util.HashSet;

public class HashSet02_FirstDupplicateFinder {
    public static void main(String[] args) {
        int[] arr = {10, 3, 7, 3, 9};

        HashSet<Integer> seen = new HashSet<>();

        for (int x : arr) {
            if (seen.contains(x)) {
                System.out.println("중복 발견: " + x);
                return;
            }
            seen.add(x);
        }
        System.out.println("중복없음");
    }
}
