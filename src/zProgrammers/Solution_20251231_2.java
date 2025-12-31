package zProgrammers;

class Solution_20251231_2 {
    public long solution(int[] sequence) {
        long answer = 0;

        int n = sequence.length;
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                arr1[i] = sequence[i];
                arr2[i] = sequence[i] * -1;
            } else {
                arr1[i] = sequence[i] * -1;
                arr2[i] = sequence[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if(i > 0) {
                arr1[i] = Math.max(arr1[i], arr1[i] + arr1[i-1]);
                arr2[i] = Math.max(arr2[i], arr2[i] + arr2[i-1]);
            }
            answer = Math.max(answer, arr1[i]);
            answer = Math.max(answer, arr2[i]);
        }
        return answer;
    }
}