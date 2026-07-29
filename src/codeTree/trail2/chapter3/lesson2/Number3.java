package codeTree.trail2.chapter3.lesson2;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];

        for (int i = 0; i < 5; ++i) {
            String name = sc.next();
            int score = sc.nextInt();

            agents[i] = new Agent(name, score);
        }

        String minName = agents[0].name;
        int minScore = agents[0].score;

        for (int i = 0; i < 5; ++i) {
            if (agents[i].score < minScore) {
                minName = agents[i].name;
                minScore = agents[i].score;
            }
        }

        System.out.println(minName + " " + minScore);
    }
}

class Agent {
    String name;
    int score;

    public Agent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void print() {
        System.out.println(name + " " + score);
    }
}
