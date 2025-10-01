package zProgrammers._202509;

class Solution_20250916_5 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                idx = i;
            }
        }

        answer[0] = max;
        answer[1] = idx;

        return answer;
    }
}