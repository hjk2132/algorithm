package codeTree.trail2.chapter3.lesson2;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-where-live/submissions?page=1&page_size=20
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        People[] arr = new People[size];
        String[] names = new String[size];

        for (int i = 0; i < size; ++i) {
            String name = sc.next();
            String address = sc.next();
            String area = sc.next();

            arr[i] = new People(name, address, area);
            names[i] = name;
        }

        Arrays.sort(names);

        String minName = names[size - 1];

        for (int i = 0; i < size; ++i) {
            if (arr[i].name.equals(minName)) {
                arr[i].print();
            }
        }

    }
}

class People {
    String name;
    String address;
    String area;

    public People(String name, String address, String area) {
        this.name = name;
        this.address = address;
        this.area = area;
    }

    public void print() {
        System.out.println("name " + name);
        System.out.println("addr " + address);
        System.out.println("city " + area);
    }
}
