package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250623_1 {
    // The Love-Letter Mystery
    public static Integer solution(String str) {
        Integer answer = 0;
        int lt = 0;
        int rt = str.length()-1;

        while(lt <= rt) {
            answer += Math.abs(str.charAt(lt) - str.charAt(rt));

            lt++;
            rt--;
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String str = in.next();
            answers.add(solution(str));
        }

        for(Integer x : answers) {
            System.out.println(x);
        }
    }
}
