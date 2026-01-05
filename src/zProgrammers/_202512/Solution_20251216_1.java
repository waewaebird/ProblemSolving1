package zProgrammers._202512;

import java.util.Arrays;

class Solution_20251216_1 {
    public int solution(int[] citations) {
        int answer = 0;

        int len = citations.length;

        // len 편중 h번 이상 인용된 논문이 h편이상이고 나머지 논문이 h번 이하
        Arrays.sort(citations);

        int max = citations[len-1];

        for (int i = max; i >= 0; i--) {
            int aCnt = 0;
            int bCnt = 0;

            for (int j = 0; j < len; j++) {
                if(citations[j] >= i) {
                    aCnt++;
                }

                if(citations[j] <= i) {
                    bCnt++;
                }
            }

            if(aCnt >= i && bCnt <= i) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}