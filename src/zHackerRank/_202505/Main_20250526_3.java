package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250526_3 {
    // Encryption
    // roqfqeylxuyxjfyqterizzkhgvngapvudnztsxeprfp
    public static String solution(String s) {
        String answer = "";

        double fn = Math.floor(Math.sqrt(s.length()));
        double cn = Math.ceil(Math.sqrt(s.length()));
        int fi = (int) Math.ceil((s.length() / cn));

        int cj = (int) cn;

        Character[][] answers = new Character[fi][cj];

        int i = 0;
        int j = 0;
        for(char x : s.toCharArray()) {
            answers[i][j] = x;
            j++;

            if(j == cj) {
                i++;
                j = 0;
            }
        }

        for (int k = 0; k < cj; k++) {
            for (int l = 0; l < fi; l++) {
                if(answers[l][k] != null) {
                    answer += answers[l][k];
                }
            }
            answer += " ";
        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));
    }
}
