package zProgrammers;

class Solution_20251002_2 {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 != 0) {
            return String.valueOf(s.charAt(s.length() /2));
        } else {
            return s.charAt(s.length() /2 -1 ) + "" + s.charAt(s.length() /2);
        }
    }
}