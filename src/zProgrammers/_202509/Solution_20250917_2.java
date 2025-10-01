package zProgrammers._202509;

class Solution_20250917_2 {
    public int solution(long num) {
        int answer = 0;

        if(num == 1) {
            answer = 0;
        } else {
            while(answer < 502) {
                answer++;

                if(num % 2 == 0){
                    num = num / 2;
                } else {
                    num = (num * 3) + 1;
                }

                if(num == 1) {
                    break;
                }
            }
        }

        if(answer >= 500) {
            answer = -1;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution_20250917_2 s = new Solution_20250917_2();
        System.out.println(s.solution(626331));
    }
}