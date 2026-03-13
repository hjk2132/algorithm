package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=java
public class Number64 {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int[] clothes = getRest(n, lost, reserve);
            giveClothes(clothes);

            int count = 0;

            for (int i = 0; i < clothes.length; ++i) {
                if (clothes[i] > 0) {
                    count = count + 1;
                }
            }

            return count;
        }

        public int[] getRest(int n, int[] lost, int[]reserve) {
            int[] array = new int[n];

            // 모두 1개씩 가짐
            for (int i = 0; i < n; ++i) {
                array[i] = 1;
            }

            // 분실
            for (int i = 0; i < lost.length; ++i) {
                array[lost[i] - 1] = array[lost[i] - 1] - 1;
            }

            // 여분
            for (int i = 0; i < reserve.length; ++i) {
                array[reserve[i] - 1] = array[reserve[i] - 1] + 1;
            }

            return array;
        }

        public void giveClothes(int[] clothes) {
            for (int i = 0; i < clothes.length; ++i) {

                if (clothes[i] == 0) {
                    // 앞사람에게 대여
                    if (i != 0 && clothes[i-1] == 2) {
                        clothes[i] = clothes[i] + 1;
                        clothes[i-1] = clothes[i-1] - 1;

                        continue;
                    }

                    // 뒷사람에게 대여
                    if (i != clothes.length - 1 && clothes[i+1] == 2) {
                        clothes[i] = clothes[i] + 1;
                        clothes[i+1] = clothes[i+1] - 1;
                    }

                }
            }
        }
    }
}
