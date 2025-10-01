package zProgrammers._202509;

class Solution_20250919_2 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(char x : my_string.toCharArray()) {
            if(Character.isUpperCase(x)) {
                answer[(int) x - 65]++;
            } else {
                answer[(int) x - 71]++;
            }
        }
        return answer;
    }
}