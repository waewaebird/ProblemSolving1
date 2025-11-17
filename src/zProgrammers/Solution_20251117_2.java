package zProgrammers;

class Solution_20251117_2 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) {
            for(char x : s.toCharArray()) {
                if(!Character.isDigit(x)) {
                    answer = false;
                    break;
                }
            }

        } else {
            answer = false;
        }

        return answer;
    }
}