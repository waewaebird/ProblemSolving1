package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void solution3(int n){
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n ; i++) {
            c = a+b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }
    public static int[] solution2(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i= 2 ; i < n ;i++){
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }


    public static List<Integer> solution(int n){
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            if(i == 0 || i == 1) {
                arr.add(1);
            } else {
                arr.add(arr.get(i - 2) + arr.get(i - 1));
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        List<Integer> aaa =solution(input1);

        for(Integer i : aaa) {
            System.out.print(i.toString() + " ");
        }

    }
}
