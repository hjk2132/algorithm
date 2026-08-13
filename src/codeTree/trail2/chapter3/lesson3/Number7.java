package codeTree.trail2.chapter3.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-distance-from-origin/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Point> arr = new ArrayList<>();

        for (int i = 0; i < size; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr.add(new Point(x, y, i));
        }

        arr.sort((p1, p2) -> {
            if (p1.distance == p2.distance) {
                return p1.index - p2.index;
            }
            return p1.distance - p2.distance;
        });

        for (Point point : arr) {
            System.out.println(point.index + 1);
        }
    }

    static class Point {
        int x;
        int y;
        int distance;
        int index;

        public Point(int x, int y, int index) {
            this.x = x;
            this.y = y;
            this.index = index;
            this.distance = Math.abs(x - 0) + Math.abs(y - 0);
        }
    }
}
