package zProgrammers._202510;

class Solution_20251013_1 {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        int cnt = 0;
        for(char x : my_string.toCharArray()) {
            if(cnt == c-1) {
                answer += x;
            }

            if(cnt == m-1) {
                cnt = 0;
            } else {
                cnt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251013_1 s = new Solution_20251013_1();
        System.out.println(s.solution("ihrhbakrfpndopljhygc", 4, 2));

    }
}