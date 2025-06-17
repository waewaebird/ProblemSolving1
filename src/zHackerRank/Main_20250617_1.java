package zHackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250617_1 {
    // The Time in Words
    public static String solution(int h, String m) {
        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(1 , "one");
        hMap.put(2 , "two");
        hMap.put(3 , "three");
        hMap.put(4 , "four");
        hMap.put(5 , "five");
        hMap.put(6 , "six");
        hMap.put(7 , "seven");
        hMap.put(8 , "eight");
        hMap.put(9 , "nine");
        hMap.put(10 , "ten");
        hMap.put(11 , "eleven");
        hMap.put(12 , "twelve");
        hMap.put(13 , "thirteen");
        hMap.put(14 , "fourteen");
        hMap.put(15 , "fifteen");
        hMap.put(16 , "sixteen");
        hMap.put(17 , "seventeen");
        hMap.put(18 , "eighteen");
        hMap.put(19 , "nineteen");
        hMap.put(20 , "twenty");
        hMap.put(21 , "twenty-one");
        hMap.put(22 , "twenty-two");
        hMap.put(23 , "twenty-three");
        hMap.put(24 , "twenty-four");

        Map<String, String> mMap = new HashMap<>();
        mMap.put("00", "o' clock");
        mMap.put("01", "one minute past");
        mMap.put("10", "ten minute past");
        mMap.put("15", "quarter past");
        mMap.put("30", "half past");
        mMap.put("40", "twenty minutes to");
        mMap.put("45", "quarter to");
        mMap.put("47", "thirteen minutes to");
        mMap.put("28", "twenty eight minutes past");
        mMap.put("29", "twenty nine minutes past");
        mMap.put("35", "twenty five minutes to");
        mMap.put("57", "three minutes to");

        if(m.length() == 1) {
            m = "0" + m;
        }

        String hours = hMap.get(h);
        if(Integer.valueOf(m) > 30) {
            hours = hMap.get(h+1);
        }

        if(m.equals("00")) {
            return hours + " " + mMap.get(m);
        } else {
            return mMap.get(m) + " " + hours;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        String m = in.next();

        System.out.println(solution(h,m));
    }
}
