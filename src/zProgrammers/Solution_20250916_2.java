package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20250916_2 {
    static String[] answer;
    static int[] ch;
    static List<String> answers = new ArrayList<>();

    public void DFS(String to, int v, String[][] tickets) {
        if(v == tickets.length) {
            answer[tickets.length] = to;

            int sum = 0;
            for(int x : ch) {
                sum += x;
            }

            if(sum == ch.length) {
                StringBuilder sb = new StringBuilder("");
                for(String x : answer) {
                    sb.append(x);
                }

                answers.add(sb.toString());
            }

        } else {
            for (int i = 0; i < tickets.length; i++) {
                if(tickets[i][0].equals(to)) {
                    if(ch[i] == 0) {
                        ch[i] = 1;
                        answer[v] = tickets[i][0];
                        DFS(tickets[i][1], v+1, tickets);
                        ch[i] = 0;
                    }
                }
            }
        }

    }


    public List<String> solution(String[][] tickets) {
        answer = new String[tickets.length+1];
        ch = new int[tickets.length];

        DFS("ICN", 0, tickets);

        answers.sort(null);

        List<String> returns = new ArrayList<>();
        int cnt = 0;

        String city = "";
        for (char x : answers.get(0).toCharArray()) {
            cnt++;
            city += x;

            if(cnt == 3) {
                returns.add(city);
                cnt = 0;
                city = "";
            }
        }

        return returns;
    }

    public static void main(String[] args) {
        Solution_20250916_2 s = new Solution_20250916_2();
        s.solution(new String[][] {{"ICN", "AAA"}, {"ICN", "CCC"}, {"CCC", "DDD"}, {"AAA", "BBB"}, {"AAA", "BBB"}, {"DDD", "ICN"}, {"BBB", "AAA"}});
        //s.solution(new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}});
        //s.solution(new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
    }
}