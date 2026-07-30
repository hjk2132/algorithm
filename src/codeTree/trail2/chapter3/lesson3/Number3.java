package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-compare-total-points/submissions?page=1&page_size=20
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Student1> students = new ArrayList<>();

        for (int i = 0; i < size; ++i) {
            String name = sc.next();
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();

            students.add(new Student1(name, first, second, third));
        }

        Collections.sort(students);

        for (Student1 student : students) {
            student.print();
        }
    }
}

class Student1 implements Comparable<Student1> {
    String name;
    int first;
    int second;
    int third;

    public Student1(String name, int first, int second, int third) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public int compareTo(Student1 object) {
        int thisSum = this.first + this.second + this.third;
        int objSum = object.first + object.second + object.third;

        if (thisSum != objSum) {
            return thisSum - objSum;
        }

        return 0;
    }

    public void print() {
        System.out.println(name + " " + first + " " + second + " " + third);
    }
}
