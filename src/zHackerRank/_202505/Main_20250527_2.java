package zHackerRank._202505;

import java.util.*;

public class Main_20250527_2 {
    // XOR Strings
    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

}



