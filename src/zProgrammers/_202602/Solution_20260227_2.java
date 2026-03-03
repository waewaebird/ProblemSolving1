package zProgrammers._202602;

import java.util.Arrays;

class Solution_20260227_2 {
    public long solution(int[] weights) {
        int[] ch = new int[1001];

        long answer = 0;

        Arrays.sort(weights);
        for (int i = 0; i < weights.length; i++) {
            if(ch[weights[i]] == 0) {
                int cnt = 0;
                for (int j = i+1; j < weights.length; j++) {
                    if(weights[i] == weights[j]) {
                        cnt++;
                    } else {
                        if(weights[j] - weights[i] > weights[i]) {
                            break;
                        } else {
                            int value = weights[j] - weights[i];

                            if(weights[i] % value == 0 && weights[j] % value == 0) {
                                if(weights[i] * 3 == weights[j] * 2 || weights[i] * 4 == weights[j] * 2 || weights[i] * 4 == weights[j] * 3) {
                                    cnt++;
                                }
                            }
                        }
                    }
                }
                ch[weights[i]] = cnt;
            } else {
                ch[weights[i]] = ch[weights[i]] - 1;
            }
            answer += ch[weights[i]];
        }

        return answer;
    }

}