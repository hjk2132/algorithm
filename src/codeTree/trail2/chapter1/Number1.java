package codeTree.trail2.chapter1;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-repeat-shooting-the-stars-five-times/introduction
public class Number1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            printStar();
        }
    }

    public static void printStar() {
        for (int i = 0; i < 10; ++i) {
            System.out.print("*");
        }
        System.out.println();
    }
}
