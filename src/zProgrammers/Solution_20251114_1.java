package zProgrammers;

class Solution_20251114_1 {
    public int[] solution(int[][] score) {
        double[] avs = new double[score.length];

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += score[i][j];
            }
            avs[i] = sum;
        }


        int[] answer = new int[score.length];
        for (int i = 0; i < avs.length; i++) {
            int cnt = 1;
            for (int j = 0; j < avs.length; j++) {
                if(i != j) {
                    if(avs[i] < avs[j]) {
                        cnt++;
                    }
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}