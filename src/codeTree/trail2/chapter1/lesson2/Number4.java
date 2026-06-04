package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-369-games-using-functions/submissions?page=1&page_size=20
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        for (int i = a; i <= b; ++i) {

            String str = Integer.toString(i);

            if (i % 3 == 0) {
                count = count + 1;
            } else {
                for (int j = 0; j < str.length(); ++j) {
                    char character = str.charAt(j);

                    if (character == '3' || character == '6' || character == '9') {
                        count = count + 1;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
