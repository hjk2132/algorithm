package codeTree.trail2.chapter3.lesson2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-rainy-day/submissions?page=1&page_size=20
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Future[] weathers = new Future[size];

        for (int i = 0; i < size; ++i) {
            String timeStr = sc.next();
            timeStr = timeStr.replace("-", "");
            String day = sc.next();
            String weather = sc.next();

            int time = Integer.parseInt(timeStr);


            weathers[i] = new Future(time, day, weather);
        }

        Arrays.sort(weathers, Comparator.comparingInt(Future::getTime));

        for (int i = 0; i < size; ++i) {
            Future future = weathers[i];

            if (future.weather.equals("Rain")) {
                String strTime = Integer.toString(future.time);

                String year = strTime.substring(0,4);
                String month = strTime.substring(4,6);
                String date = strTime.substring(6,8);

                System.out.println(year + "-" + month + "-" + date + " " + future.day + " " + future.weather);

                break;
            }
        }
    }
}

class Future {
    int time;
    String day;
    String weather;

    public Future(int time, String day, String weather) {
        this.time = time;
        this.day = day;
        this.weather = weather;
    }

    public int getTime() {
        return time;
    }
}
