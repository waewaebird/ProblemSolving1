import com.fasterxml.jackson.databind.node.IntNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String solution(String str) {
        String answer = "YES";
        int end = str.length() / 2;

        List<Integer> temps = new ArrayList<>();

        for (int i = 1; i <= end; i++) {

            int startSize = 0;
            if(temps.size() > 0) {
                String a = String.valueOf(temps.get(temps.size()-1));
                startSize = a.length();
            }

            boolean isNine = false;
            for (int j = startSize; j <= str.length()-i; j=j+i) {
                Integer temp = Integer.valueOf(str.substring(j, j+i));

                if(temp > 0 && temp % 9 != 0) {
                    temps.add(temp);
                } else {
                    if(j != str.length()-1) {
                        temps.add(temp);
                        isNine = true;
                        break;
                    }
                }
            }

            if(!isNine) {
                boolean flag = true;
                for (int j = 1; j < temps.size(); j++) {
                    if(temps.get(j) - temps.get(j-1) != 1) {
                        flag = false;
                        break;
                    }
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

        System.out.println(answers);
    }
}
