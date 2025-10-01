package zProgrammers._202509;

class Solution_20250925_1 {
    public int solution(int n) {
        int answer = 0;

        int sum = 0;

        int lt = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;

            if(sum >= n) {
                if(sum == n) {
                    answer++;
                } else {
                    while(sum >= n) {
                        sum -= lt;

                        if(sum == n) {
                            answer++;
                        }
                        lt++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20250925_1 s = new Solution_20250925_1();
        System.out.println(s.solution(15));

    }
}