package zProgrammers._202509;

public class Solution_20250925_2 {
    public long solution(int n) {
        long answer = 0;

        String str = String.valueOf(n);
        for(char x : str.toCharArray()) {
            answer += Integer.valueOf(String.valueOf(x));
        }

        return answer;
    }
}