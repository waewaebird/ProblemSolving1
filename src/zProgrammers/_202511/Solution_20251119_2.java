package zProgrammers._202511;

class Solution_20251119_2 {
    public int solution(int[] numbers) {
        int answer = 0;

        int[] arr = new int[10];
        for(int x : numbers) {
            arr[x] = 1;
        }

        for (int i = 1; i <= 9; i++) {
            if(arr[i] == 0) {
                answer += i;
            }
        }

        return answer;
    }
}