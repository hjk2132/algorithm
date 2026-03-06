package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class Number60 {
    public int solution(int number, int limit, int power) {
        int[] list = getPower(number, limit, power);
        int steel = 0;

        for (int i = 0; i < list.length; ++i) {
            steel = steel + list[i];
        }

        return steel;
    }

    public int[] getPower(int number, int limit, int power) {
        int[] list = new int[number];

        for (int i = 0; i < number; ++i) {
            int count = getCount(i+1);

            if (count > limit) {
                list[i] = power;
            } else {
                list[i] = count;
            }
        }

        return list;
    }

    public int getCount(int input) {
        int count = 0;

        for (int i = 1; i * i <= input; i++) {
            if (i * i == input) {
                count = count + 1;
            } else if (input % i == 0) {
                count = count + 2;
            }
        }

        return count;
    }
}
