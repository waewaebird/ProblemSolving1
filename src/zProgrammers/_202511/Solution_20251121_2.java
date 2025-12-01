package zProgrammers._202511;

class Solution_20251121_2 {
    public int[] solution(long n) {
        int len = String.valueOf(n).length();

        int[] answer = new int[len];

        String str = String.valueOf(n);
        for (int i = len-1; i >= 0 ; i--) {
            answer[Math.abs(i - len) - 1] = Integer.valueOf(String.valueOf(str.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution_20251121_2 s = new Solution_20251121_2();
        System.out.println(s.solution(12345));
    }
}