package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5R {
    protected static int solution(int n) {
        int[] arr = new int[n+1];
        List<Integer> answers = new ArrayList<>();

        for(int i = 2 ; i <= n ; i++) {
            if(arr[i] == 0) {
                answers.add(i);
                for(int j = i ; j <= n ; j=j+i) {
                    arr[j] = 1;
                }
            }
        }

        return answers.size();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }

}
