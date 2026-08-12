package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-personal-info/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 5; ++i) {
            String name = sc.next();
            int height = sc.nextInt();
            float weight = sc.nextFloat();

            people.add(new Person(name, height, weight));
        }

        people.sort((p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("name");
        for (Person person : people) {
            System.out.printf("%s %d %.1f\n", person.name, person.height, person.weight);
        }

        System.out.println();
        people.sort((p1, p2) -> p2.height - p1.height);

        System.out.println("height");
        for (Person person : people) {
            System.out.printf("%s %d %.1f\n", person.name, person.height, person.weight);
        }
    }

    static class Person
    {
        String name;
        int height;
        float weight;

        public Person(String name, int height, float weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}
