package zProgrammers._202509;

class Solution_20250924_3 {
    public String solution(String s) {
        String answers = "";

        for (int i = 0; i < s.length(); i++) {
            if(i == 0) {
                if(Character.isAlphabetic(s.charAt(i))) {
                    answers += Character.toUpperCase(s.charAt(i));
                } else {
                    answers += s.charAt(i);
                }

            } else {
                if(s.charAt(i-1) == ' ') {
                    answers += Character.toUpperCase(s.charAt(i));
                } else {
                    answers += Character.toLowerCase(s.charAt(i));
                }

            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Solution_20250924_3 s = new Solution_20250924_3();

        System.out.println(s.solution("3people unFollowed me"));
    }
}