package zProgrammers;

class Solution_20251118_1 {
    public String[] solution(String[] quiz) {
        String[] answers = new String[quiz.length];

        int index = 0;
        for(String x : quiz) {
            String[] temps = x.split(" ");
            int a = Integer.valueOf(temps[0]);
            int b = Integer.valueOf(temps[2]);
            int result = Integer.valueOf(temps[4]);

            String answer = "X";

            if(temps[1].equals("+")) {
                if(a + b == result) {
                    answer = "O";
                }
            } else {
                if(a - b == result) {
                    answer = "O";
                }
            }

            answers[index] = answer;
            index++;
        }

        return answers;
    }

    public static void main(String[] args) {
        Solution_20251118_1 s = new Solution_20251118_1();
        s.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"});
    }
}