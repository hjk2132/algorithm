package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class Number75 {
    public String solution(String s) {
        String[] list = s.split(" ");
        int[] nums = new int[list.length];

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = Integer.parseInt(list[i]);
        }

        Integer min = nums[0];
        Integer max = nums[0];

        for (int i = 0; i < nums.length; ++i) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        return "" + Integer.toString(min) + " " + Integer.toString(max);
    }
}
