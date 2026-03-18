package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class Number70 {
    public int[] solution(String[] wallpaper) {
        int xMin = 100;
        int xMax = 0;
        int yMin = 100;
        int yMax = 0;

        // i가 y, j가 x
        for (int i = 0; i < wallpaper.length; ++i) {
            for (int j = 0; j < wallpaper[i].length(); ++j) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (xMin > j) { xMin = j; }
                    if (xMax < j) { xMax = j; }
                    if (yMin > i) { yMin = i; }
                    if (yMax < i) { yMax = i; }
                }
            }
        }

        int[] answer = { yMin, xMin, yMax + 1, xMax + 1};

        return answer;
    }
}
