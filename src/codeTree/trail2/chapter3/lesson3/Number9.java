package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-line-up-students-2/submissions
public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int size = sc.nextInt();

        for (int i = 0; i < size; ++i) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            students.add(new Student(height, weight, i + 1));
        }

        students.sort((s1, s2) -> {
            if (s1.height == s2.height) {
                return s2.weight - s1.weight;
            }
            return s1.height - s2.height;
        });

        for (Student student : students) {
            System.out.println(student.height + " " + student.weight + " " + student.index);
        }

        sc.close();
    }

    static class Student {
        int height;
        int weight;
        int index;

        public Student(int height, int weight, int index) {
            this.height = height;
            this.weight = weight;
            this.index = index;
        }
    }
}
