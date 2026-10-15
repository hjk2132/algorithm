package codeTree.trail2.chapter7.lesson1;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-the-grace-form-teacher-2/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] presents = new int[n];

        for (int i = 0; i < n; ++i) {
            presents[i] = sc.nextInt();
        }

        Arrays.sort(presents);

        int count = 0;

        while (count < n && b >= presents[count] / 2) {
            b = b - presents[count];
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
