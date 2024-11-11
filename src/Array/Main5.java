package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static int solution(int n){
        List<Integer> ss = new ArrayList<>();
        ss.add(2);
        ss.add(3);

        List<Integer> arr = new ArrayList<>();
        for(int i = 4 ; i <n+1 ; i++) {
            arr.add(i);
        }

        List<Integer> real = new ArrayList<>(arr);

        boolean flag = true;
        for(int i : arr) {
            for(int j = 0 ; j <ss.size() ; j++) {
                if(ss.get(j) * ss.get(j) > n) {
                    flag = false;
                    break;
                }

                if(i%ss.get(j) == 0) {
                    real.remove(ss.get(j));
                }
            }
            if(flag == false) {
                break;
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
