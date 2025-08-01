package zHackerRank._202507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250731_1 {
    // Separate the Numbers
    public static String solution(String str) {
        String answer = "YES";
        int end = str.length() / 2 + 1;

        List<String> temps = new ArrayList<>();

        for (int i = 1; i <= end; i++) {

            int startSize = 0;
            if(temps.size() > 0) {
                for (int j = 0; j < temps.size(); j++) {
                    startSize += temps.get(j).length();
                }
            }

            boolean isNine = false;
            for (int j = startSize; j <= str.length()-i; j=j+i) {

                Long temp = Long.valueOf(str.substring(j, j+i));

                if(temp == 0) {
                    temps.add(str.substring(j, j + i));
                } else if(temp == 9L || temp == 99L || temp == 999L || temp == 9999L || temp == 99999L || temp == 999999L || temp == 99999999L || temp == 999999999L || temp == 9999999999L || temp == 99999999999L || temp == 999999999999L || temp == 9999999999999L) {
                    if(j != str.length()-1) {
                        temps.add(str.substring(j, j+i));
                        isNine = true;
                        break;
                    }
                } else {
                    temps.add(str.substring(j, j + i));
                }
            }

            if(!isNine) {
                boolean flag = true;

                int totalLength = temps.get(0).length();
                for (int j = 1; j < temps.size(); j++) {
                    if(temps.get(j).charAt(0) == '0' || temps.get(j-1).charAt(0) == '0') {
                        flag = false;
                        break;
                    }

                    Long v1 = Long.valueOf(temps.get(j));
                    Long v2 = Long.valueOf(temps.get(j-1));
                    if(v1 - v2 != 1) {
                        flag = false;
                        break;
                    }

                    totalLength += temps.get(j).length();
                }

                if(totalLength != str.length()) {
                    flag = false;
                }

                if(temps.size() < 2) {
                    flag = false;
                }

                if(flag) {
                    answer += " " + temps.get(0);
                    break;
                } else {
                    temps = new ArrayList<>();
                }
            }

            if(startSize > 0) {
                startSize = 0;
                temps = new ArrayList<>();
                i--;
            }
        }

        if(answer.equals("YES")) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            String str = in.next();

            answers.add(solution(str));
        }

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
