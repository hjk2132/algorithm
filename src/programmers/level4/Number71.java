package programmers.level4;

import java.util.ArrayList;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class Number71 {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 각 privacy 별 순회
        for (int i = 0; i < privacies.length; ++i) {
            // 년, 월, 일
            String[] todayDate = getDayInfo(today);
            // 년월일, 약관명
            String[] privacyInfo = getPrivacyInfo(privacies[i]);
            // 약관기간
            int term = 0;

            // 일치하는 약관 탐색
            for (int j = 0; j < terms.length; ++j) {
                String[] termInfo = getTermInfo(terms[j]);

                if (privacyInfo[1].equals(termInfo[0])) {
                    term = Integer.parseInt(termInfo[1]);
                }
            }

            // 만료일
            Integer expireDate = getExpireDate(getDayInfo(privacyInfo[0]), term);
            Integer integerToday = makeIntegerDate(todayDate);

            if (expireDate <= integerToday) {
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public Integer makeIntegerDate(String[] date) {

        if (date[1].length() == 1) {
            date[1] = "0" + date[1];
        }

        if (date[2].length() == 1) {
            date[2] = "0" + date[2];
        }

        String newDateString
                = date[0] + date[1] + date[2];

        return Integer.parseInt(newDateString);
    }

    public Integer getExpireDate(String[] date, int term) {
        Integer year = Integer.parseInt(date[0]);
        Integer month = Integer.parseInt(date[1]);
        Integer day = Integer.parseInt(date[2]);
        Integer addedDays = term * 28;

        Integer totalDays = (day - 1) + addedDays;
        Integer newDay = (totalDays % 28) + 1;
        Integer addedMonth = totalDays / 28;

        Integer totalMonths = (month - 1) + addedMonth;
        Integer newMonth = (totalMonths % 12) + 1;
        Integer addedYear = totalMonths / 12;

        Integer newYear = year + addedYear;

        String newYearString = Integer.toString(newYear);
        String newMonthString = Integer.toString(newMonth);
        String newDayString = Integer.toString(newDay);

        if (newDayString.length() == 1) {
            newDayString = "0" + newDayString;
        }

        if (newMonthString.length() == 1) {
            newMonthString = "0" + newMonthString;
        }

        String expireDateString
                = newYearString + newMonthString + newDayString;

        return Integer.parseInt(expireDateString);
    }

    public String[] getDayInfo(String day) {
        String[] dayInfo = day.split("\\.");

        // 년, 월, 일
        return dayInfo;
    }

    public String[] getTermInfo(String term) {
        String[] termInfo = new String[2];
        termInfo = term.split(" ");

        // 약관명, 기간(월)
        return termInfo;
    }

    public String[] getPrivacyInfo(String privacy) {
        String[] privacyInfo = new String[2];
        privacyInfo = privacy.split(" ");

        // 날짜, 약관명
        return privacyInfo;
    }
}
