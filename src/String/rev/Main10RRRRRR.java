package String.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10RRRRRR {
    // 가장 짧은 문자거리
    public static int[] solution(String str, String s) {
        int[] answer = new int[str.length()];

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == s.charAt(0)) {
                temp.add(i);
            }
        }

        int index = 0;
        for(char x : str.toCharArray()) {
            int a = Integer.MAX_VALUE;
            for(int n : temp) {
                a = Math.min(a, Math.abs(index - n));
            }
            answer[index] = a;
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String s = in.next();

        for(int answer : solution(str,s)) {
            System.out.print(answer + " ");
        }
    }
}
