package zProgrammers._202601;

class Solution_20260105_2 {
    public int solution(int num1, int num2) {
        double temp = (double)num1 / (double)num2;
        int answer = (int) (temp * 1000);
        return answer;
    }
}