package codeTree.trail3.chapter2.lesson4;

import java.util.LinkedList;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-process-numeric-commands-8/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; ++i) {
            String str = sc.next();

            if (str.equals("push_front")) {
                int val = sc.nextInt();
                list.addFirst(val);
            } else if (str.equals("push_back")) {
                int val = sc.nextInt();
                list.addLast(val);
            } else if (str.equals("pop_front")) {
                System.out.println(list.removeFirst());
            } else if (str.equals("pop_back")) {
                System.out.println(list.removeLast());
            } else if (str.equals("size")) {
                System.out.println(list.size());
            } else if (str.equals("empty")) {
                System.out.println(list.isEmpty() ? 1 : 0);
            } else if (str.equals("front")) {
                System.out.println(list.getFirst());
            } else if (str.equals("back")) {
                System.out.println(list.getLast());
            }
        }

        sc.close();
    }
}
