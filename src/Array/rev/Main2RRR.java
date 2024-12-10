package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRR {
    private static int solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            if(i == 0) {
                answers.add(arr[i]);
            } else {
                if(answers.get(answers.size()-1) < arr[i]) {
                    answers.add(arr[i]);
                }
            }
        }



        return answers.size();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n,arr));

    }
}
