package programmers.level4;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class Number74 {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Set<String>> reportList = new HashMap<>();
        makeReportList(reportList, report);

        String[] bannedList = getBannedList(reportList, id_list, k);
        int[] answer = getAnswer(reportList, bannedList, id_list);

        return answer;
    }

    public void makeReportList(HashMap<String, Set<String>> reportList, String[] report) {
        for (int i = 0; i < report.length; ++i) {
            String[] split = report[i].split(" ");
            String key = split[0];
            String value = split[1];

            Set<String> reportedSet = reportList.get(key);

            if (reportedSet == null) {
                reportedSet = new HashSet<>();
                reportList.put(key, reportedSet);
            }

            reportedSet.add(value);
        }
    }

    public String[] getBannedList(HashMap<String, Set<String>> reportList, String[] id_list, int k) {
        int[] count = new int[id_list.length];
        String[] bannedList = new String[id_list.length];

        for (String key : reportList.keySet()) {
            Set<String> reportedSet = reportList.get(key);

            if (reportedSet != null) {
                for (String reported : reportedSet) {
                    for (int i = 0; i < id_list.length; ++i) {
                        if (reported.equals(id_list[i])) {
                            count[i] = count[i] + 1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < id_list.length; ++i) {
            if (count[i] >= k) {
                bannedList[i] = id_list[i];
            } else {
                bannedList[i] = "";
            }
        }

        return bannedList;
    }

    public int[] getAnswer(HashMap<String, Set<String>> reportList, String[] bannedList, String[] id_list) {
        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; ++i) {
            int count = 0;
            String user = id_list[i];
            Set<String> reportedSet = reportList.get(user);

            if (reportedSet != null) {
                for (int j = 0; j < bannedList.length; ++j) {
                    String bannedUser = bannedList[j];

                    if (reportedSet.contains(bannedUser)) {
                        count = count + 1;
                    }
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}
