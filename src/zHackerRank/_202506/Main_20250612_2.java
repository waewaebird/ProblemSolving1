package zHackerRank._202506;

import java.util.Scanner;

public class Main_20250612_2 {
    // Append and Delete
    public static String solution(String s, String t, int k) {
        String answer = "No";

        String mainTemp = s;
        String subTemp = t;

        if(s.length() < t.length()) {
            mainTemp = t;
            subTemp = s;
        }

        boolean same = false;

        if(mainTemp.indexOf(subTemp) == -1) {
            int cnt = 0;

            while(mainTemp.indexOf(subTemp) < 0  || !mainTemp.equals("")) {
                if(subTemp.contains(mainTemp)) {
                    break;
                }

                mainTemp = mainTemp.substring(0, mainTemp.length()-1);
                cnt++;
            }


            if(mainTemp.length() == subTemp.length()) {
                cnt += mainTemp.length();
                mainTemp = "";

                if(cnt + subTemp.length() <= k) {
                    return "Yes";
                }
            } else {
                if(cnt + subTemp.length() <= k) {
                    return "Yes";
                } else {
                    cnt = cnt + (subTemp.length() - mainTemp.length());

                    if(cnt == k) {
                        return "Yes";
                    }
                }
            }

        } else {
            int cnt = 0;

            while(!mainTemp.equals("")) {
                if(subTemp.contains(mainTemp)) {
                    same = true;
                    break;
                }

                mainTemp = mainTemp.substring(0, mainTemp.length()-1);
                cnt++;
            }

            if(mainTemp.length() == subTemp.length()) {
                if(cnt + 2 == k) {
                    return "Yes";
                } else {
                    if(same && cnt == 0) {
                        if(k % 2 == 0) {
                            return "Yes";
                        }
                    }

                    cnt += mainTemp.length();
                    mainTemp = "";

                    if(cnt + subTemp.length() <= k) {
                        return "Yes";
                    }
                }
            } else {
                if(cnt + subTemp.length() <= k) {
                    return "Yes";
                } else {
                    cnt = cnt + (subTemp.length() - mainTemp.length());

                    if(cnt == k) {
                        return "Yes";
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        System.out.println(solution(s,t,k));
    }
}
