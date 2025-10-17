package zProgrammers;

class Solution_20251017_1 {
    public int solution(int n) {
        boolean[] arr = new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            if(arr[i] == false) {
                for (int j = i+i; j <= n; j = j+i) {
                    arr[j] = true;
                }
            }
        }


        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(arr[i] == false) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251017_1 s = new Solution_20251017_1();
        System.out.println(s.solution(5));

    }
}