package zProgrammers;

class Solution_20251125_2 {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if(i < s) {
                sb.append(my_string.charAt(i));
            } else {
                if(i-s < overwrite_string.length()) {
                    sb.append(overwrite_string.charAt(i-s));
                } else {
                    sb.append(my_string.charAt(i));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution_20251125_2 s = new Solution_20251125_2();
        System.out.println(s.solution("He11oWor1d","lloWorl",2));
    }
}