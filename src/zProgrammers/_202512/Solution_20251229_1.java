package zProgrammers._202512;

class Solution_20251229_1 {
    public int[] solution(int[] sequence, int k) {
        int[] answers = new int[2];
        answers[0] = 0;
        answers[1] = sequence.length+1;

        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < sequence.length; rt++) {
            sum += sequence[rt];

            while(sum >= k) {
                if(sum == k) {
                    if(answers[1] - answers[0] > rt-lt) {
                        answers[0] = lt;
                        answers[1] = rt;
                    }
                }

                sum -= sequence[lt];
                if(sum == k) {
                    if(answers[1] - answers[0] > rt-lt) {
                        answers[0] = lt;
                        answers[1] = rt;
                    }
                }
                lt++;
            }
        }
        return answers;
    }
}