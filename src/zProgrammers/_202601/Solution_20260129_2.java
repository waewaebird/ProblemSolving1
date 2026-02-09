package zProgrammers._202601;

class Solution_20260129_2 {
    public int solution(String s) {
        int answer = 0;

        char now = ' ';
        int nowCnt1 = 0;
        int nowCnt2 = 0;
        for(char x : s.toCharArray()) {
            if(now == ' ') {
                now = x;
                nowCnt1++;
            } else {
                if(x != now) {
                    nowCnt2++;
                } else {
                    nowCnt1++;
                }
            }

            if(nowCnt1 == nowCnt2) {
                answer++;
                now = ' ';
            }
        }

        if(now != ' ') {
            answer++;
        }

        return answer;
    }
}