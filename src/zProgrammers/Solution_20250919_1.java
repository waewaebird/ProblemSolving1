package zProgrammers;

class Solution_20250919_1 {
    public String solution(String s) {
        String answer = "";

        int cnt = 0;
        for(Character x : s.toCharArray()) {
            if(Character.isAlphabetic(x)) {
                if(cnt == 0 || cnt % 2 == 0) {
                    answer += Character.toUpperCase(x);
                } else {
                    answer += Character.toLowerCase(x);
                }
                cnt++;
            } else {
                answer += x;
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20250919_1 s = new Solution_20250919_1();

        System.out.println(s.solution("   abc de     fghi  "));
        System.out.println(s.solution("TrY HeLlO WoRlD"));

    }
}