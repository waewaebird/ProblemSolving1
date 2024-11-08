package String.rev;

import java.util.Scanner;

public class Main10R {
    public static int[] solution(String str1, String str2) {
        int[] answers = new int[str1.length()];
        char c = str2.charAt(0);

        int cnt = 1000;
        for(int i = 0; i <str1.length(); i++) {
            if(str1.charAt(i) == c) {
                answers[i] = 0;
                cnt = 0;
            } else {
                cnt++;
                answers[i] = cnt;
            }
        }

        cnt = 10000;
        for(int i = str1.length()-1 ; i > -1 ;  i--) {
            if(str1.charAt(i) == c) {
                answers[i] = 0;
                cnt = 0;
            } else {
                cnt++;
                answers[i] = Math.min(cnt, answers[i]);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        for(int i : solution(str1, str2)) {
            System.out.print(i + " ");
        }
    }
}

// cnt를 0부터 시작하면 1부터 들어가기때문에 반대로 들어오는걸 못잡음. cnt를 엄청 크게 해서 100을 넘지않으니 100초과로
// 가장 작은 숫자가 들어갈 수 있음
//

