package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20250909_1 {
    public List<Integer> solution(int num, int total) {
        int i;

        int cnt = 0;
        int sum = 0;
        for (i = -total - 1000; i <= total+1000; i++) {
            sum += i;
            cnt++;

            if(cnt == num) {
                if(sum == total) {
                    break;
                }

                cnt--;
                sum = sum - (i - num + 1);
            }
        }


        List<Integer> answers = new ArrayList<>();
        for (int j = i-num + 1; j <= i; j++) {
            answers.add(j);
        }

        System.out.println(answers);

        return answers;
    }

    public static void main(String[] args) {
        Solution_20250909_1 s = new Solution_20250909_1();
        s.solution(7,0);
    }
}