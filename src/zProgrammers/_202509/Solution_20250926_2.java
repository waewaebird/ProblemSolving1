package zProgrammers._202509;

class Solution_20250926_2 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        Character c = String.valueOf(k).charAt(0);
        for (int l = i; l <= j; l++) {
            for(char x : String.valueOf(l).toCharArray()) {
                if(c == x) {
                    answer++;
                }
            }
        }
        return answer;
    }
}