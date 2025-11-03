package zProgrammers._202510;

class Solution_20251020_1 {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for(int x : num_list) {
            if(x % 2 == 0) {
                even += String.valueOf(x);
            } else {
                odd += String.valueOf(x);
            }
        }

        int answer = Integer.valueOf(odd) + Integer.valueOf(even);
        return answer;
    }
}