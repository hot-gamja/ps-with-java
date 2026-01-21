package ds.hash;

import java.util.HashMap;

public class HashMap01_FrequencyCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        HashMap<String, Integer> cnt = new HashMap<>();
        for (String w : words) {
            cnt.put(w, cnt.getOrDefault(w, 0) + 1);
        }
        System.out.println("빈도수: " + cnt);
        System.out.println("apple 개수:" + cnt.get("apple"));
    }
}
