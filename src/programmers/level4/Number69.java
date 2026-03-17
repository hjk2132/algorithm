package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class Number69 {
    public String solution(String[] survey, int[] choices) {
        // R, T, C, F, J, M, A, N
        int[] typeScore = new int[8];
        String answer = "";

        for (int i = 0; i < choices.length; ++i) {
            getScore(survey[i], choices[i], typeScore);
        }

        answer = getString(typeScore);

        return answer;

    }

    public String getString(int[] typeScore) {
        String answer = "";

        if (typeScore[0] >= typeScore[1]) {
            answer = answer + "R";
        } else {
            answer = answer + "T";
        }

        if (typeScore[2] >= typeScore[3]) {
            answer = answer + "C";
        } else {
            answer = answer + "F";
        }

        if (typeScore[4] >= typeScore[5]) {
            answer = answer + "J";
        } else {
            answer = answer + "M";
        }

        if (typeScore[6] >= typeScore[7]) {
            answer = answer + "A";
        } else {
            answer = answer + "N";
        }

        return answer;
    }

    public void getScore(String type, int choice, int[] typeScore) {
        String type1 = type.substring(0, 1);
        String type2 = type.substring(1, 2);

        int index1 = getIndex(type1);
        int index2 = getIndex(type2);

        switch(choice) {
            case 1:
                typeScore[index1] = typeScore[index1] + 3;
                break;
            case 2:
                typeScore[index1] = typeScore[index1] + 2;
                break;
            case 3:
                typeScore[index1] = typeScore[index1] + 1;
                break;
            case 4:
                break;
            case 5:
                typeScore[index2] = typeScore[index2] + 1;
                break;
            case 6:
                typeScore[index2] = typeScore[index2] + 2;
                break;
            case 7:
                typeScore[index2] = typeScore[index2] + 3;
                break;
            default:
                break;
        }

    }

    public int getIndex(String input) {
        switch(input) {
            case "R":
                return 0;
            case "T":
                return 1;
            case "C":
                return 2;
            case "F":
                return 3;
            case "J":
                return 4;
            case "M":
                return 5;
            case "A":
                return 6;
            case "N":
                return 7;
            default:
                return -1;
        }
    }

    public String getType(int input) {
        switch(input) {
            case 0:
                return "R";
            case 1:
                return "T";
            case 2:
                return "C";
            case 3:
                return "F";
            case 4:
                return "J";
            case 5:
                return "M";
            case 6:
                return "A";
            case 7:
                return "N";
            default:
                return "";
        }
    }
}
