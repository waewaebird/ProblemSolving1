package zProgrammers;

class Solution_20250911_1 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution_20250911_1 s = new Solution_20250911_1();
        s.solution(new int[]{0,0,0,1}, 3);
    }
}