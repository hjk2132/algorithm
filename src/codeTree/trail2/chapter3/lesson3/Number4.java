package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < size; ++i) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int number = i + 1;

            students.add(new Student(number, height, weight));
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.height + " " + student.weight + " " + student.number);
        }

    }

    static class Student implements Comparable<Student> {
        int number;
        int height;
        int weight;

        public Student(int number, int height, int weight) {
            this.number = number;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Student other) {
            if (this.height == other.height) {
                if (this.weight == other.weight) {
                    return this.number - other.number;
                }
                return other.weight - this.weight;
            }
            return other.height - this.height;
        }

    }
}
