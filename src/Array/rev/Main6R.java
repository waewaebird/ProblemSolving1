package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6R {
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int nn : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(nn)).reverse();
            Integer temp = Integer.parseInt(sb.toString());

            int flag = 0;
            for(int i = 2 ; i < temp ; i++) {
                if(temp % i == 0) {
                    flag++;
                }
            }
            if(temp > 1 && flag == 0) {
                list.add(temp);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        for(Integer nn : solution(n, arr)) {
            System.out.print(nn + " ");
        }

    }

}
