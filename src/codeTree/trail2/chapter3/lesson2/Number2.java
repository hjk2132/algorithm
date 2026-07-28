package codeTree.trail2.chapter3.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-next-level/submissions?page=1&page_size=20
class User {
    private String id;
    private int level;

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }

    public void print() {
        System.out.println("user " + id + " lv " + level);
    }
}

public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        User codeTree = new User("codetree", 10);
        User newbie = new User(id, level);

        codeTree.print();
        newbie.print();
    }
}
