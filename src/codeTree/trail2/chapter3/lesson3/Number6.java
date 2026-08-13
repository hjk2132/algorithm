package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sort-by-height-and-weight/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < size; ++i) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            people.add(new Person(name, height, weight));
        }

        people.sort((p1, p2) -> {
            if (p1.height == p2.height) {
                return p2.weight - p1.weight;
            }
            return p1.height - p2.height;
        });

        for (Person person : people) {
            System.out.println(person.name + " " + person.height + " " + person.weight + " ");
        }

    }

    static class Person {
        String name;
        int height;
        int weight;

        public Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}
