package programmers.level4;

import java.util.ArrayList;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/172928?language=java
public class Number73 {
    class Point {
        int x;
        int y;

        public void setPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[] solution(String[] park, String[] routes) {

        Point here = new Point(0, 0);
        ArrayList<Point> obstacle = new ArrayList<>();
        getMap(park, obstacle, here);

        for (int i = 0; i < routes.length; ++i) {
            move(here, obstacle, routes[i], park);
        }

        int[] answer = new int[2];
        answer[0] = here.x;
        answer[1] = here.y;

        return answer;
    }

    public void getMap(String[] park, ArrayList<Point> obstacle, Point here) {
        int length = park[0].length();

        for (int i = 0; i < park.length; ++i) {
            for (int j = 0; j < length; ++j) {
                if (park[i].charAt(j) == 'S') {
                    here.setPoint(i, j);
                }

                if (park[i].charAt(j) == 'X') {
                    obstacle.add(new Point(i, j));
                }
            }
        }
    }

    public void move(Point here, ArrayList<Point> obstacle, String order, String[] park) {
        int x = here.x;
        int y = here.y;

        String[] orders = order.split("\\s");
        if (orders[0].equals("W")) {
            int count = Integer.parseInt(orders[1]);

            for (int i = 0; i < count; ++i) {
                x = x;
                y = y - 1;

                for(int j = 0; j < obstacle.size(); ++j) {
                    if (obstacle.get(j).x == x && obstacle.get(j).y == y) {
                        return;
                    }
                }

                if (x < 0 || y >= park[0].length() || y < 0 || x >= park.length) {
                    return;
                }
            }
        }

        if (orders[0].equals("E")) {
            int count = Integer.parseInt(orders[1]);

            for (int i = 0; i < count; ++i) {
                x = x;
                y = y + 1;

                for(int j = 0; j < obstacle.size(); ++j) {
                    if (obstacle.get(j).x == x && obstacle.get(j).y == y) {
                        return;
                    }
                }

                if (x < 0 || y >= park[0].length() || y < 0 || x >= park.length) {
                    return;
                }
            }
        }

        if (orders[0].equals("N")) {
            int count = Integer.parseInt(orders[1]);

            for (int i = 0; i < count; ++i) {
                x = x - 1;
                y = y;

                for(int j = 0; j < obstacle.size(); ++j) {
                    if (obstacle.get(j).x == x && obstacle.get(j).y == y) {
                        return;
                    }
                }

                if (x < 0 || y >= park[0].length() || y < 0 || x >= park.length) {
                    return;
                }
            }
        }

        if (orders[0].equals("S")) {
            int count = Integer.parseInt(orders[1]);

            for (int i = 0; i < count; ++i) {
                x = x + 1;
                y = y;

                for(int j = 0; j < obstacle.size(); ++j) {
                    if (obstacle.get(j).x == x && obstacle.get(j).y == y) {
                        return;
                    }
                }

                if (x < 0 || y >= park[0].length() || y < 0 || x >= park.length) {
                    return;
                }
            }
        }

        here.setPoint(x, y);
    }
}
