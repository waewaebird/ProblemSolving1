package zProgrammers._202511;

class Solution_20251111_2 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += price*i;
        }

        if(answer < money) {
            answer = 0;
        } else {
            answer = answer - money;
        }

        return answer;
    }


}