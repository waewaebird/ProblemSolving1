package zProgrammers;

class Solution_20260616_3 {
    public int solution(int slice, int n) {
        int answer = 0;

        for (int i = 1; i <= 100 ; i++) {
            if(slice * i >= n) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}