package zProgrammers;

class Solution_20250915_1 {
    public int solution(String t, String p) {
        int answer = 0;

        Long ip = Long.valueOf(p);

        int len = p.length();

        StringBuilder sb = new StringBuilder("");
        for (int rt = 0; rt < t.length(); rt++) {
            sb.append(t.charAt(rt));

            if(sb.length() == len) {
                if(Long.valueOf(sb.toString()) <= ip) {
                    answer++;
                }
                sb.deleteCharAt(0);
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution_20250915_1 s = new Solution_20250915_1();
        s.solution("500220839878", "7");
    }
}