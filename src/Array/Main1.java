package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static ArrayList<Integer> solution2(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n ; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static ArrayList<Integer> solution(int input1, int[] inputArr){
        ArrayList<Integer> answers = new ArrayList<>();

        for(int i = 0 ; i < inputArr.length ; i++) {
            if(i == 0) {
                answers.add(inputArr[i]);
            } else {
                if(inputArr[i] > inputArr[i-1]) {
                    answers.add(inputArr[i]);
                }
            }
        }
        return answers;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        int[] inputArr = new int[input1];
        for(int i = 0; i < input1 ; i++) {
            inputArr[i] =in.nextInt();
        }


        for(Integer i : solution(input1, inputArr)) {
            System.out.print(i + " ");
        }

    }
}
