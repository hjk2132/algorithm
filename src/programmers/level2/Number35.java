package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/82612
public class Number35 {
    public long totalPrice(int price, int count) {
        long sum = 0;
        for (int i = 1; i <= count; ++i) {
            sum = sum + price * i;
        }

        return sum;
    }

    public long solution(int price, int money, int count) {
        long sum = totalPrice(price, count);
        long result = sum - money;

        if (result > 0) {
            return result;
        } else {
            return 0;
        }
    }
}
