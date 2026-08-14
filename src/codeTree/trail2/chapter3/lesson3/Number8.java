package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-indices-of-sorted-array/submissions
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] answer = new int[size];
        List<Pointer> arr = new ArrayList<>();

        for (int i = 1; i <= size; ++i) {
            int input = sc.nextInt();
            arr.add(new Pointer(input, i));
        }

        arr.sort((p1, p2) -> {
            return (p1.value - p2.value);
        });

        for (int i = 0; i < size; ++i) {
            Pointer point = arr.get(i);
            int tempIdx = point.index;
            answer[tempIdx - 1] = i + 1;
        }

        for (int i = 0; i < size; ++i) {
            System.out.print(answer[i] + " ");
        }

        sc.close();
    }

    static class Pointer {
        int value;
        int index;

        public Pointer(int input, int index) {
            this.value = input;
            this.index = index;
        }
    }
}
