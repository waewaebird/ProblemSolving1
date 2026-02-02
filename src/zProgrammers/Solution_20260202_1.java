package zProgrammers;

import java.util.Arrays;

class Solution_20260202_1 {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            } else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution_20260202_1 s = new Solution_20260202_1();
        System.out.println(s.solution(new int[] {0, 1, 2, 3, 4, 5} ,  new int[] {4,1,2})); // 1 2 3
    }
}