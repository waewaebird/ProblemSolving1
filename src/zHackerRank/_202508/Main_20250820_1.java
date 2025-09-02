package zHackerRank._202508;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250820_1 {
    // The Grid Search
    public static String solution(int r1, int c1, Character[][] temp1, int r2, int c2, Character[][] temp2) {
        String answer = "NO";

        String flag = "";
        for(char x : temp2[0]) {
            flag += x;
        }

        for (int i = 0; i < r1; i++) {
            String str = "";
            for(char x : temp1[i]) {
                str += x;
            }

            if(str.contains(flag)) {
                String tmp = "";
                for (int rt = 0; rt < str.length(); rt++) {
                    tmp += str.charAt(rt);

                    if(tmp.length() == c2) {
                        if(tmp.equals(flag)) {
                            int a = rt-c2+1;
                            int b = rt;

                            int aCnt = 0;
                            for (int j = 1; j < r2; j++) {
                                String tempFlag = "";
                                for(char xx : temp2[j]) {
                                    tempFlag += xx;
                                }

                                if(i+1 < r1) {
                                    String temps = "";
                                    for(char xx : temp1[i+j]) {
                                        temps += xx;
                                    }

                                    temps = temps.substring(a,b+1);

                                    if(tempFlag.equals(temps)) {
                                        aCnt++;
                                    }
                                }
                            }

                            if(aCnt == r2-1) {
                                answer = "YES";
                            }
                        }

                        if(answer.equals("YES")) {
                            break;
                        }
                        tmp = tmp.substring(1, c2);
                    }
                    if(answer.equals("YES")) {
                        break;
                    }
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        List<String> answer = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int r1 = in.nextInt();
            int c1 = in.nextInt();

            Character[][] temp1 = new Character[r1][c1];
            for (int j = 0; j < r1; j++) {
                String str = in.next();

                for (int k = 0; k < c1; k++) {
                    temp1[j][k] = str.charAt(k);
                }
            }

            int r2 = in.nextInt();
            int c2 = in.nextInt();

            Character[][] temp2 = new Character[r2][c2];
            for (int j = 0; j < r2; j++) {
                String str = in.next();

                for (int k = 0; k < c2; k++) {
                    temp2[j][k] = str.charAt(k);
                }
            }

            answer.add(solution(r1,c1,temp1,r2,c2,temp2));
        }

        for(String a : answer) {
            System.out.println(a);
        }
    }
}
