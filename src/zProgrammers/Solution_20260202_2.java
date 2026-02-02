package zProgrammers;

class Solution_20260202_2 {
    public String solution(String new_id) {
        String answer = "";

        for(char x : new_id.toCharArray()) {
            if(Character.isAlphabetic(x)) {
                answer += String.valueOf(x).toLowerCase();
            } else if(Character.isDigit(x) || x == '-' || x == '_' || x == '.') {
                answer += x;
            }
        }

        for (int i = 0; i < 2; i++) {
            if(i == 0) {
                while(true) {
                    if(answer.contains("..")) {
                        answer = answer.replace(".." , ".");
                    } else {
                        break;
                    }
                }
            } else if(i == 1) {
                if(answer.length() > 0 && answer.charAt(0) == '.') {
                    answer = answer.substring(1);
                }

                if(answer.length() > 0 && answer.charAt(answer.length()-1) == '.') {
                    answer = answer.substring(0, answer.length()-1);
                }
            }
        }

        if(answer.equals("")) {
            for (int i = 0; i < 3; i++) {
                answer += 'a';
            }
        }

        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);

            if(answer.charAt(answer.length()-1) == '.') {
                answer = answer.substring(0, answer.length()-1);
            }
        }

        while(answer.length() < 3) {
            answer += answer.charAt(answer.length()-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20260202_2 s = new Solution_20260202_2();
        //System.out.println(s.solution("...!@BaT#*..y.abcdefghijklm")); // bat.y.abcdefghi
        //System.out.println(s.solution("z-+.^.")); //  z--
        //System.out.println(s.solution("=.=")); // aaa
        //System.out.println(s.solution("abcdefghijklmn.p")); // abcdefghijklmn

        //System.out.println(s.solution("................b"));


        System.out.println(s.solution("........................"));


    }
}