package codeTree.trail3.chapter2.lesson5;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-golden-toast/description
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); ++i) {
            list.addLast(str.charAt(i));
        }

        ListIterator<Character> it = list.listIterator(n);

        for (int i = 0; i < m; ++i) {
            String order = sc.next();

            if (order.equals("L")) {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (order.equals("R")) {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (order.equals("D")) {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (order.equals("P")) {
                String input = sc.next();
                it.add(input.charAt(0));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        System.out.print(sb);

        sc.close();
    }
}
