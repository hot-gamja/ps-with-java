package bj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon_9498 {
   public Backjoon_9498() {
   }

   public static void main(String[] var0) throws IOException {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));
      int var2 = Integer.parseInt(var1.readLine());
      if (var2 >= 90) {
         System.out.println("A");
      } else if (var2 >= 80) {
         System.out.println("B");
      } else if (var2 >= 70) {
         System.out.println("C");
      } else if (var2 >= 60) {
         System.out.println("D");
      } else {
         System.out.println("F");
      }

   }
}
