package String;

import java.util.Scanner;

public class Main10 {
    public static int[] solution1(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == t) {
                p=0;
                answer[i]=p;
            } else {
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i =s.length()-1; i>=0 ; i--) {
            if(s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static String solution(String s, char t) {
        String answer = "";
        char tc = t;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == tc) {
                answer += "0 ";
            } else {
                // 3번쨰라고 하면 0 1 2 검색 // 4~끝까지 검색
                int lt = i - 1;
                int rt = i + 1;
                int cnt = 0;

                while (lt < rt) {
                    cnt++;

                    if (lt > -1 && s.charAt(lt) == tc) {
                        answer += cnt + " ";
                        break;
                    } else if (rt < s.length()  && s.charAt(rt) == tc) {
                        answer += cnt + " ";
                        break;
                    }
                    lt--;
                    rt++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input1 = in.next();
        /*String input2 = in.next();*/
        char c = in.next().charAt(0);

        System.out.println(solution(input1, c));

    }
}