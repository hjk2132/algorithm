package codeTree.trail2.chapter3.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-product-code/submissions?page=1&page_size=20
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();

        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(name, code);

        product1.print();
        product2.print();
    }
}

class Product {
    String name;
    int code;

    public Product (String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void print() {
        System.out.println("product " + code + " is " + name);
    }
}
