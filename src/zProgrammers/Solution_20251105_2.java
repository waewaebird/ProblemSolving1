package zProgrammers;

class Solution_20251105_2 {
    public int solution(int a, int b) {
        String temp1 = String.valueOf(a) + String.valueOf(b);
        String temp2 = String.valueOf(b) + String.valueOf(a);

        if(Integer.valueOf(temp1) > Integer.valueOf(temp2)) {
            return Integer.valueOf(temp1);
        } else {
            return Integer.valueOf(temp2);
        }
    }
}