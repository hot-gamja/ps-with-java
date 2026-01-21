package ds.hash;

import java.util.HashSet;

public class HashSet01_UniqueAndContains {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        System.out.println("중복 제거 결과: " + set);
        System.out.println("3 있음? " + set.contains(3));
        System.out.println("4 있음? " + set.contains(4));
    }
}
