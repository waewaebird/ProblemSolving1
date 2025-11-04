package zProgrammers;

class Solution_20251104_2 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < (int) Math.floor(food[i] / 2); j++) {
                sb.append(i);
            }
        }

        String answer = sb + "0";
        sb.reverse();

        return answer+sb;
    }

    public static void main(String[] args) {
        Solution_20251104_2 s = new Solution_20251104_2();
        System.out.println(s.solution(new int[] {1,7,1,2}));
    }
}