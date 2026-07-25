package codeTree.trail2.chapter3.lesson1;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sorting-words/submissions?page=1&page_size=20
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] answer = new String[size];

        for (int i = 0; i < size; ++i) {
            answer[i] = sc.next();
        }

        Arrays.sort(answer);

        for (int i = 0; i < size; ++i) {
            System.out.println(answer[i]);
        }
    }
}
