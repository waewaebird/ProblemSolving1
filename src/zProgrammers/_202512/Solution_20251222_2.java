package zProgrammers._202512;

import java.util.Arrays;

class Solution_20251222_2 {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        Arrays.sort(indices);

        int j = 0;
        for (int i = 0; i < my_string.length(); i++) {
            boolean flag = true;
            for (; j < indices.length; j++) {
                if(i == indices[j]) {
                    flag =false;
                    break;
                } else if(i < indices[j]) {
                    break;
                }
            }
            if(flag) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251222_2 s = new Solution_20251222_2();
        System.out.println(s.solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }
}