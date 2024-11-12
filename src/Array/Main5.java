package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static int solution(int n){

        List<Integer> arr = new ArrayList<>();
        for(int i = 4 ; i <n+1 ; i++) {
            arr.add(i);
        }

        for(int i = 4 ; i <n+1 ; i++) {
            arr.add(i);
        }

        for(int i : arr) {
            if(i%2 == 0) {
                arr.remove(i);
            }
        }


        return arr.size();
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        System.out.println(solution(input1));

    }
}