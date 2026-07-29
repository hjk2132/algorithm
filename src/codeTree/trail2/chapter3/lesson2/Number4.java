package codeTree.trail2.chapter3.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-bomb-removal/submissions?page=1&page_size=20
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Info info = new Info(code, color, second);

        info.print();
    }
}

class Info {
    String code;
    String color;
    int second;

    public Info(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    public void print() {
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + second);
    }
}
