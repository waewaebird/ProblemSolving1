package zProgrammers;

class Solution_20251212_3 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;

        for (int i = 3; i < total/3 + 1; i++) {
            if(total % i == 0) {
                int a = Math.max(i, total/i);
                int b = Math.min(i, total/i);

                if((a-2) * (b-2) == yellow) {
                    answer[0] = a;
                    answer[1] = b;
                    break;
                }
            }
        }
        return answer;
    }
}