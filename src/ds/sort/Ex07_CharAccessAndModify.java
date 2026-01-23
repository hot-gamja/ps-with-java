package ds.sort;

import java.util.Arrays;

public class Ex07_CharAccessAndModify {
    public static void main(String[] args) {
        String[] arr = {"it", "i", "love", "java", "hi"};

        String word = arr[2];
        System.out.println("선택 단어 " + word);

        char first = word.charAt(0);
        char third = word.charAt(2);
        System.out.println("첫번째: " + first);
        System.out.println("세 번째 글자" + third);

        System.out.print("모든 문자: ");
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+ " ");
        }
        System.out.println();

        char[] ch = word.toCharArray();
        ch[0] = 'L';
        String newWord = new String(ch);

        arr[2] = newWord;

        System.out.println("바꾼 단어: " + arr[2]);
        System.out.print("전체배열: " + Arrays.toString(arr));
    }
}


