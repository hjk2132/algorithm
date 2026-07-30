package codeTree.trail2.chapter3.lesson3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sort-by-height/submissions?page=1&page_size=20
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        People[] peoples = new People[size];

        for (int i = 0; i < size; ++i) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            peoples[i] = new People(name, height, weight);
        }

        Arrays.sort(peoples, Comparator.comparingInt(People::getHeight));

        for (int i = 0; i < size; ++i) {
            peoples[i].print();
        }

    }
}

class People {
    String name;
    int height;
    int weight;

    public People(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void print() {
        System.out.println(name + " " + height + " " + weight);
    }
}
