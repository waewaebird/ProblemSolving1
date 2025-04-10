package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRRRRRRRR {

    public static int solution(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                list.add(arr[i]);
            } else {
                if(arr[i] > list.get(list.size()-1)) {
                    list.add(arr[i]);
                }
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }


        System.out.println(solution(n,arr));
    }
}
