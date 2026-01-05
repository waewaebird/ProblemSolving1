package zProgrammers._202512;

class Solution_20251231_1 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        int flagCnt = 0;
        for (int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                flagCnt++;
                if(db[i][1].equals(id_pw[1])) {
                    flagCnt++;
                }
            }
        }

        if(flagCnt == 0) {
            answer = "fail";
        } else if(flagCnt == 1) {
            answer = "wrong pw";
        } else if(flagCnt == 2) {
            answer = "login";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251231_1 s = new Solution_20251231_1();
        s.solution(new String[] {"meosseugi", "1234"}, new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}});

    }
}