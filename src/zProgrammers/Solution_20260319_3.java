package zProgrammers;

class Solution_20260319_3 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries) {
            int x = q[0];
            int y = q[1];

            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        Solution_20260319_3 s = new Solution_20260319_3();
        s.solution(new int[] {0, 1, 2, 3, 4} , new int[][] {{0, 3},{1, 2},{1, 4}});
    }
}