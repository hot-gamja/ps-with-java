package ds.hash;

import java.util.HashSet;

public class HashSet03_IntersectionDemo {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {3, 4, 4, 5, 6, 7};

        HashSet<Integer> setA = new HashSet<>();
        for (int x : A) setA.add(x);

        HashSet<Integer> intersection = new HashSet<>();
        for (int x : B) {
            if (setA.contains(x)) {
                intersection.add(x);
        }
        System.out.println("교집합: " + intersection);
        
    }
    }
}
