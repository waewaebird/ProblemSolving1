package zProgrammers;

class Solution_20251215_1 {
    public int solution(String[] order) {
        int answer = 0;

        for(String x : order) {
            if(x.contains("latte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251215_1 s = new Solution_20251215_1();

        s.solution(new String[] {"cafelatte", "americanoice", "hotcafelatte", "anything"});
    }
}