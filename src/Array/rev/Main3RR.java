package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RR {
    public static List<String> solution(int n, int[] arrA, int[] arrB){
        List<String> answers = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            if(arrA[i] == arrB[i]) {
                answers.add("D");
            } else if(arrA[i] == 1 && arrB[i] == 3) {
                answers.add("A");
            } else if(arrA[i] == 2 && arrB[i] == 1) {
                answers.add("A");
            } else if(arrA[i] == 3 && arrB[i] == 2) {
                answers.add("A");
            } else {
                answers.add("B");
            }
        }
        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arrA[i] = in.nextInt();
        }

        for(int i = 0 ; i < n ; i++) {
            arrB[i] = in.nextInt();
        }



        for(String s : solution(n, arrA, arrB)) {
            System.out.println(s);
        }
    }
}
