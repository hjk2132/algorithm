package codeTree.trail2.chapter3.lesson1;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-kth-special-string/submissions?page=1&page_size=20
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int index = sc.nextInt();
        String text = sc.next();

        String[] arr = new String[size];
        String[] answer = new String[size];

        for (int i = 0; i < size; ++i) {
            arr[i] = sc.next();
        }

        int count = 0;
        for (int i = 0; i < size; ++i) {
            if (arr[i].indexOf(text) == 0) {
                answer[count] = arr[i];
                count = count + 1;
            }
        }

        Arrays.sort(answer, 0, count);

        System.out.println(answer[index - 1]);
    }
}
