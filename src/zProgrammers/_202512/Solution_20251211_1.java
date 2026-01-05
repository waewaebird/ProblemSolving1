package zProgrammers._202512;

class Solution_20251211_1 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int sh = Integer.valueOf(pos.split(":")[0]);
        int sm = Integer.valueOf(pos.split(":")[1]);

        int ops = Integer.valueOf(op_start.split(":")[0]) * 60 + Integer.valueOf(op_start.split(":")[1]);
        int ope = Integer.valueOf(op_end.split(":")[0]) * 60 + Integer.valueOf(op_end.split(":")[1]);
        int totals = Integer.valueOf(video_len.split(":")[0]) * 60 + Integer.valueOf(video_len.split(":")[1]);


        int it = 0;
        for(String x : commands) {
            int nows = sh * 60 + sm;

            if(x.equals("next")) {
                if(nows >= ops && nows <= ope) {
                    sh = Integer.valueOf(op_end.split(":")[0]);
                    sm = Integer.valueOf(op_end.split(":")[1]);
                }

                sm += 10;

                if(sm >= 60) {
                    sm = sm - 60;
                    sh++;
                }

                it = sh * 60 + sm;

                if(it >= ops && it <= ope) {
                    sh = Integer.valueOf(op_end.split(":")[0]);
                    sm = Integer.valueOf(op_end.split(":")[1]);
                }

                if(it >= totals) {
                    sh = Integer.valueOf(video_len.split(":")[0]);
                    sm = Integer.valueOf(video_len.split(":")[1]);
                }
            } else {
                if(nows >= ops && nows <= ope) {
                    sh = Integer.valueOf(op_end.split(":")[0]);
                    sm = Integer.valueOf(op_end.split(":")[1]);
                }

                sm -= 10;

                if(sm < 0) {
                    sm = sm + 60;
                    sh--;
                }

                it = sh * 60 + sm;

                if(it <= 0) {
                    sh = 0;
                    sm = 0;
                    it = 0;
                }

                if(it >= ops && it <= ope) {
                    sh = Integer.valueOf(op_end.split(":")[0]);
                    sm = Integer.valueOf(op_end.split(":")[1]);
                }
            }
        }

        String ssh = String.valueOf(sh);
        String ssm = String.valueOf(sm);

        if(ssh.length() == 1) {
            ssh = "0" + ssh;
        }
        if(ssm.length() == 1) {
            ssm = "0" + ssm;
        }

        return ssh + ":" + ssm;
    }
}