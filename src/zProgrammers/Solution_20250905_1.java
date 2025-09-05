package zProgrammers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_20250905_1 {
    // 무인도 여행
    static Character[][] temps;
    static String[][] arr;

    public static void DFS(int cnt, int v1, int v2, int sum) {
        arr[v1][v2] = cnt + " " + temps[v1][v2];
        temps[v1][v2] = 'O';

        int[] DI = {-1,0,0,1};
        int[] DJ = {0,-1,1,0};

        for (int i = 0; i < 4; i++) {
            int n1 = v1 + DI[i];
            int n2 = v2 + DJ[i];

            if(n1 >= 0 && n1 < temps.length && n2 >= 0 && n2 < temps[0].length) {
                if(Character.isDigit(temps[n1][n2])) {
                    DFS(cnt, n1, n2, sum + Integer.parseInt(String.valueOf(temps[n1][n2])));
                }
            }
        }
    }

    public int[] solution(String[] maps) {
        temps= new Character[maps.length][maps[0].length()];
        arr = new String[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                temps[i][j] = maps[i].charAt(j);
            }
        }

        int cnt = 1;
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if(Character.isDigit(temps[i][j])) {
                    DFS(cnt, i,j, Integer.parseInt(String.valueOf(temps[i][j])));
                    cnt++;
                }
            }
        }

        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                if(arr[i][j] != null) {
                    String[] t = arr[i][j].split(" ");

                    if(sumMap.get(Integer.valueOf(t[0])) == null) {
                        sumMap.put(Integer.valueOf(t[0]), Integer.valueOf(t[1]));
                    } else {
                        sumMap.put(Integer.valueOf(t[0]), sumMap.get(Integer.valueOf(t[0])) + Integer.valueOf(t[1]));
                    }
                }
            }
        }

        List<Integer> answers = new ArrayList<>();
        for(Integer value : sumMap.values()) {
            answers.add(value);
        }

        answers.sort(null);

        int[] answer;
        if(answers.size() > 0) {
            answer = new int[answers.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = answers.get(i);
            }

        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
