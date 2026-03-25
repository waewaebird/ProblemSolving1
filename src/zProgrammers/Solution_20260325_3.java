package zProgrammers;

class Solution_20260325_3 {
    public int solution(int n) {
        int answer = 0;
        for(char x : String.valueOf(n).toCharArray()) {
            answer += Integer.valueOf(String.valueOf(x));
        }
        return answer;
    }
}