package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20260106_1 {
    public List<Integer> solution(int[] answers) {
        int[] a1 = {1,2,3,4,5}; // 5
        int[] a2 = {2,1,2,3,2,4,2,5}; // 8
        int[] a3 = {3,3,1,1,2,2,4,4,5,5}; //10

        int one = 0;
        int two = 0;
        int three = 0;

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        int max = 0;

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == a1[one]) {
                cnt1++;
            }

            if(answers[i] == a2[two]) {
                cnt2++;
            }

            if(answers[i] == a3[three]) {
                cnt3++;
            }

            max = Math.max(cnt1, max);
            max = Math.max(cnt2, max);
            max = Math.max(cnt3, max);

            one++;
            two++;
            three++;

            if(one == 5) {
                one = 0;
            }

            if(two == 8) {
                two = 0;
            }

            if(three == 10) {
                three = 0;
            }
        }

        List<Integer> answer = new ArrayList<>();
        if(max == cnt1) {
            answer.add(1);
        }

        if(max == cnt2) {
            answer.add(2);
        }

        if(max == cnt3) {
            answer.add(3);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20260106_1 s = new Solution_20260106_1();

        //System.out.println(s.solution(new int[] {1,2,3,4,5})); // 1
        System.out.println(s.solution(new int[] {1,3,2,4,2})); // 1,2,3
    }
}