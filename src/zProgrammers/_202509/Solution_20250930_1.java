package zProgrammers._202509;

class Solution_20250930_1 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        return sb.toString();
    }
}