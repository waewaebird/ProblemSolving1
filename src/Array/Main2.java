package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static int solution2(int[] arr){
        int answer = 1, max=arr[0];

        for(int i=1 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                answer++;
                max=arr[i];
            }
        }
        return answer;
    }

    public static int solution(int[] inputArr){
        ArrayList<Integer> answers = new ArrayList<>();

        for(int i = 0 ; i < inputArr.length ; i++) {
            if(i == 0) {
                answers.add(inputArr[i]);
            } else {
                if(inputArr[i] > answers.get(answers.size()-1)) {
                    answers.add(inputArr[i]);
                }
            }
        }
        return answers.size();
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        int[] inputArr = new int[input1];
        for(int i = 0; i < input1 ; i++) {
            inputArr[i] =in.nextInt();
        }

        System.out.print(solution(inputArr));
    }
}
