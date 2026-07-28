package codeTree.trail2.chapter3.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-007/submissions?page=1&page_size=20
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secretCode = sc.next();
        String meetingPoint = sc.next();
        int meetingTime = sc.nextInt();

        System.out.println("secret code : " + secretCode);
        System.out.println("meeting point : " + meetingPoint);
        System.out.println("time : " + meetingTime);
    }
}
