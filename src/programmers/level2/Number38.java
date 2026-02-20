package programmers.level2;

import java.util.Scanner;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12969
public class Number38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; ++i) {
            for (int j = 0; j < a; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
