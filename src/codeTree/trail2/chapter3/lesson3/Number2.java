package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-korean-english-math-order/submissions?page=1&page_size=20
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < size; ++i) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students.add(new Student(name, kor, eng, math));
        }

        Collections.sort(students);

        for (int i = 0; i < size; ++i) {
            students.get(i).print();
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void print() {
        System.out.println(name + " " + kor + " " + eng + " " + math);
    }

    @Override
    public int compareTo(Student object) {
        if (this.kor != object.kor) {
            return object.kor - this.kor;
        } else if (this.eng != object.eng) {
            return object.eng - this.eng;
        } else {
            return object.math - this.math;
        }
    }
}
