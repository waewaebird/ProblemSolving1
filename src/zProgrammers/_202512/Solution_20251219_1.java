package zProgrammers._202512;

class Solution_20251219_1 {
    public String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            if(i%q == r) {
                answer += code.charAt(i);
            }
        }

        return answer;
    }
}