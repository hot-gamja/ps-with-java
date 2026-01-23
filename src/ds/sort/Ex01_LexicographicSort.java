package ds.sort;

import java.util.Arrays;

public class Ex01_LexicographicSort {
    public static void main(String[] args) {
        String[] arr = {"banna", "apple", "car", "app"};
        Arrays.sort(arr);

        System.out.println("결과" + Arrays.toString(arr));
    }
}
