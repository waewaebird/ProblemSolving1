package zProgrammers._202509;

class Solution_20250922_1 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            int number = 1;
            if(signs[i] != true) {
                number = -1;
            }

            answer += (absolutes[i] * number);
        }

        return answer;
    }
}