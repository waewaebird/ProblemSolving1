package zProgrammers._202601;

import java.util.ArrayList;
import java.util.List;

class Solution_20260120_2 {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();

        String flag = "";

        for (int i = 0; i < str_list.length; i++) {
            if(flag.equals("") && str_list[i].equals("l")) {
                flag = "l";
                break;
            } else if (flag.equals("") && str_list[i].equals("r")) {
                flag = "r";
                list.clear();
            } else {
                list.add(str_list[i]);
            }
        }

        if(flag.equals("")) {
            list.clear();
        }

        return list.toArray(list.toArray(new String[0]));
    }

    public static void main(String[] args) {
        Solution_20260120_2 s = new Solution_20260120_2();
        s.solution(new String[] {"u", "u", "l", "r"});
    }
}