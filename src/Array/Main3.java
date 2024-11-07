package Array;

import java.util.Scanner;

public class Main3 {
    public static String solution2(int n, int[] a, int[] b){
        String answer ="";

        for(int i = 0 ; i<n ; i++) {
            if(a[i] == b[i]) {
                answer += "D";
            } else if(a[i] == 1 && b[i] == 3){
                answer += "A";
            }  else if(a[i] == 2 && b[i] == 1){
                answer += "A";
            } else if(a[i] == 3 && b[i] == 2){
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }

    public static String solution(int[] inputArrA, int[] inputArrB){
        String answer ="";

        for(int i = 0; i <inputArrA.length ; i++) {
            if(inputArrA[i] == 1) {
                if(inputArrB[i] == 1) {
                    answer += "D";
                } else if(inputArrB[i] == 2) {
                    answer += "B";
                } else if(inputArrB[i] == 3) {
                    answer += "A";
                }
            } else if(inputArrA[i] == 2) {
                if(inputArrB[i] == 1) {
                    answer += "A";
                } else if(inputArrB[i] == 2) {
                    answer += "D";
                } else if(inputArrB[i] == 3) {
                    answer += "B";
                }
            } else if(inputArrA[i] == 3) {
                if(inputArrB[i] == 1) {
                    answer += "B";
                } else if(inputArrB[i] == 2) {
                    answer += "A";
                } else if(inputArrB[i] == 3) {
                    answer += "D";
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        int[] inputArrA = new int[input1];
        int[] inputArrB = new int[input1];

        for(int i = 0; i < input1 ; i++) {
            inputArrA[i] =in.nextInt();
        }

        for(int i = 0; i < input1 ; i++) {
            inputArrB[i] =in.nextInt();
        }


        for(char c : solution(inputArrA, inputArrB).toCharArray()) {
            System.out.println(c);
        }

    }
}
