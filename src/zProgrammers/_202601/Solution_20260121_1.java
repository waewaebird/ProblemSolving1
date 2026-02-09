package zProgrammers._202601;

class Solution_20260121_1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n + 1];

        for (int i = n-1; i < num_list.length; i++) {
            answer[i - n + 1] = num_list[i];
        }

        return answer;
    }
}