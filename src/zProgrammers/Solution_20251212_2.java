package zProgrammers;

class Solution_20251212_2 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(!s.equals("1")) {
            int os = s.length();
            s = s.replace("0", "");

            answer[1] += os - s.length();

            s = Integer.toBinaryString(s.length());

            answer[0]++;
        }

        return answer;
    }
}