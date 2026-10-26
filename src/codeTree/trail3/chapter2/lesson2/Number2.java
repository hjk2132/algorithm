package codeTree.trail3.chapter2.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-process-numeric-commands-5/description
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if (command.equals("push_back")) {
                int val = sc.nextInt();
                list.add(val);
            } else if (command.equals("pop_back")) {
                list.remove(list.size() - 1);
            } else if (command.equals("size")) {
                System.out.println(list.size());
            } else if (command.equals("get")) {
                int k = sc.nextInt();
                System.out.println(list.get(k - 1));
            }
        }

        sc.close();
    }
}
