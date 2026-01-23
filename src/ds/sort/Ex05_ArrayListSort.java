package ds.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex05_ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> origin = new ArrayList<>();
        origin.add("abc");
        origin.add("a");
        origin.add("ab");
        origin.add("abcd");

        ArrayList<String> l1 = new ArrayList<>(origin);
        ArrayList<String> l2 = new ArrayList<>(origin);
        ArrayList<String> l3 = new ArrayList<>(origin);

        l1.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }
                return a.compareTo(b);
            }
        });
        l2.sort((a , b) -> {
            if ( a.length() != b.length() ){
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        l3.sort(
            Comparator.comparingInt(String::length)
            .thenComparing(Comparator.naturalOrder())
        );
    }
}
