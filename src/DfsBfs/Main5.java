package DfsBfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    static int n;
    static int arr[];
    static int m;
    static List<Integer> temp = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int sum) {
        if(temp.size() > answer) {
            return;
        }
        if(sum >= m) {
            if(sum == m) {
                answer = Math.min(answer, temp.size());
            }
        } else {
            for (int i = arr.length-1; i >= 0 ; i--) {
                temp.add(arr[i]);
                DFS(sum + arr[i]);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        m = in.nextInt();

        DFS(0);
        System.out.println(answer);
    }

}
