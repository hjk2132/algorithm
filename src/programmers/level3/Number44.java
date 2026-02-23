package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Number44 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int longer = Math.max(sizes[i][0], sizes[i][1]);
            int shorter = Math.min(sizes[i][0], sizes[i][1]);

            maxWidth = Math.max(maxWidth, longer);
            maxHeight = Math.max(maxHeight, shorter);
        }

        return maxWidth * maxHeight;
    }
}
