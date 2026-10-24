package codeTree.trail2.chapter10.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-minimum-number-of-wifi/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int[] list = new int[n+1];
        int[] wifi = new int[n+1];
        int[] area = new int[105];

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            // people on stage
            if (list[i] == 1) {
                // already available
                if (area[i] == 1) { continue; }
                wifi[count] = i + m;

                for (int j = Math.max(0, wifi[count] - m); j <= Math.min(n-1, wifi[count] + m); ++j) {
                    area[j] = 1;
                }

                count = count + 1;

                boolean isPass = true;

                for (int j = 0; j < n+1; ++j) {
                    // people on stage & not available
                    if (list[j] == 1 && area[j] == 0) {
                        isPass = false;
                        break;
                    }
                }

                // everyone can use
                if (isPass) {
                    break;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
