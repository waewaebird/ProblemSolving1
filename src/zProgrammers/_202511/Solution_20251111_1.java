package zProgrammers._202511;

class Solution_20251111_1 {
    public int solution(String my_string) {
        int answer = 0;

        String[] temp = my_string.split(" ");

        answer = Integer.valueOf(temp[0]);
        for (int i = 1; i < temp.length; i = i + 2) {
            if(temp[i].equals("+")) {
                answer += Integer.valueOf(temp[i+1]);
            } else {
                answer -= Integer.valueOf(temp[i+1]);
            }
        }
        return answer;
    }
}