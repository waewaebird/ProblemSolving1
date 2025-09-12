package zProgrammers;

class Solution_20250912_2 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int a : array) {
            if(a > height) {
                answer++;
            }
        }

        return answer;
    }
}