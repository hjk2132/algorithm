package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class Number58 {
    public int solution(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                for (int k = 0; k < j; ++k) {
                    if (isPrime(nums[k], nums[j], nums[i])) {
                        count = count + 1;
                    }
                }
            }
        }

        return count;
    }

    public boolean isPrime(int a, int b, int c) {
        int sum = a + b + c;

        for (int i = 2; i < sum; ++i) {
            if (sum % i == 0) {
                return false;
            }
        }

        return true;
    }
}
