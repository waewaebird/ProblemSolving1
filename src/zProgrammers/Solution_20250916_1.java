package zProgrammers;

class Solution_20250916_1 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] word = {"aya", "ye", "woo", "ma"};

        for(String s : babbling) {
            boolean eq = false;

            for(String w : word) {
                if(s.equals(w)) {
                    eq = true;
                    break;
                } else {
                    if(s.contains(w)) {
                        for(String to : word) {
                            s = s.replace(to, " ");
                        }

                        for(char x : s.toCharArray()) {
                            eq = true;

                            if(x != ' ') {
                                eq = false;
                                break;
                            }
                        }
                    }
                }
            }

            if(eq) {
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution_20250916_1 s = new Solution_20250916_1();

        s.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
    }
}