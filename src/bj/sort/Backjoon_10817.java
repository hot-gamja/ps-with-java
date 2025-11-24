package bj.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }

}
