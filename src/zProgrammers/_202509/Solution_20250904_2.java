package zProgrammers._202509;

import java.util.HashMap;
import java.util.Map;

class Solution_20250904_2 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if(i == 0) {
                wordMap.put(words[i], 1);
            } else {
                if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                    int p = i % n + 1;
                    int c = (i) / n + 1;
                    answer[0] = p;
                    answer[1] = c;
                    break;
                } else {
                    if(wordMap.get(words[i]) != null) {
                        int p = i % n + 1;
                        int c = (i) / n + 1;
                        answer[0] = p;
                        answer[1] = c;
                        break;
                    } else {
                        wordMap.put(words[i], 1);
                    }
                }
            }
        }
        return answer;
    }
}