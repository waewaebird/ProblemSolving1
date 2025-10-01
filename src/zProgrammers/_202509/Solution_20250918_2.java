package zProgrammers._202509;

class Solution_20250918_2 {
    public int solution(int[] common) {
        int answer = 0;

        if(common[2] - common[1] == common[1] - common[0]) {
            answer = common[common.length-1] + (common[1] - common[0]);
        }

        if((double)common[2] / common[1] == (double)common[1] / common[0]) {
            double m = (double)common[2] / common[1];

            answer = (int) (common[common.length-1] * m);
        }

        System.out.println(answer);

        return answer;
    }


    public static void main(String[] args) {
        Solution_20250918_2 s = new Solution_20250918_2();
        s.solution(new int[] {2,4,8});
    }
}