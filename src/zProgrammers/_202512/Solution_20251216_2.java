package zProgrammers._202512;

class Solution_20251216_2 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;

        if(is_prefix.length() < my_string.length()) {
            if(my_string.substring(0 , is_prefix.length()).equals(is_prefix)) {
                answer = 1;
            }
        }

        return answer;
    }
}