package zProgrammers._202601;

class Solution_20260109_2 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer = answer + (a + d*i);
            }
        }
        return answer;
    }
}