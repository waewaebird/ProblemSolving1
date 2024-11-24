package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8R {
    public static List<Integer> solution(int n , int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for(int nn : arr) {
            int cnt = 1;
            for(int i = 0 ; i < n ; i++) {
                if(nn < arr[i]) {
                    cnt = cnt+1;
                }
            }
            answers.add(cnt);
        }

        return answers;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        for(int i : solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

}
