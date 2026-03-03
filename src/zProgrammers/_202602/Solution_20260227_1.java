package zProgrammers._202602;

class Solution_20260227_1 {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[(intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1)];

        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            int x = intervals[i][0];
            int y = intervals[i][1];

            for (int j = x; j <= y; j++) {
                answer[index] = arr[j];
                index++;
            }
        }

        return answer;
    }
}