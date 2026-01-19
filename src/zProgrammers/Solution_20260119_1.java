package zProgrammers;

class Solution_20260119_1 {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder("");

        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                if(mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            }

            if(mode == 0) {
                if(code.charAt(i) != '1' && i % 2 == 0) {
                    sb.append(code.charAt(i));
                }
            } else {
                if(code.charAt(i) != '1' && i % 2 != 0) {
                    sb.append(code.charAt(i));
                }
            }
        }

        String answer = "EMPTY";

        if(sb.toString().length() > 0) {
            answer = sb.toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20260119_1 s = new Solution_20260119_1();
        System.out.println(s.solution("abc1abc1abc"));
    }
}