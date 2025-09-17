package zProgrammers;

class Solution_20250917_3 {
    public boolean solution(int x) {
        String str = String.valueOf(x);

        int temp = 0;
        for (char c : str.toCharArray()) {
            temp += Integer.valueOf(String.valueOf(c));
        }

        boolean answer = true;

        if(x % temp != 0) {
            answer = false;
        }

        return answer;
    }
}