package zProgrammers;

class Solution_20251229_2 {
    public String solution(String s, int n) {
        String answer = "";

        for(char x : s.toCharArray()){
            if(!Character.isAlphabetic(x)) {
                answer += x;
            } else {
                if(Character.isLowerCase(x)) {
                    int next = (int) x + n;
                    if(next > 122) {
                        next -= 26;
                    }
                    answer += (char) next;
                } else {
                    int next = (int) x + n;
                    if(next > 90) {
                        next -= 26;
                    }
                    answer += (char) next;
                }
            }
        }

        return answer;
    }
}