package zProgrammers._202509;

class Solution_20250929_2 {
    public long solution(int a, int b) {
        long answer = 0;

        if(a > b) {
            int temp = b;
            b = a;
            a = temp;
        }

        for(int i = a ; i <= b ; i++) {
            answer += i;
        }


        return answer;
    }
}