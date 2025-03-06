package DfsBfs;

import com.fasterxml.jackson.databind.introspect.Annotated;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    static int n;
    static int m;
    static int[] arr;
    static int[] ch;
    static int[] answer;
    static List<Integer> temp;

    public static void DFS(int v) {

        if(v == m) {
            for (int x : answer) {
                if(x > 0) {
                    System.out.print(x + " ");
                    temp.add(x);
                }
            }
            System.out.println();
        } else {
            for (int i = v; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    answer[v] = arr[i];
                    DFS(v+1);
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new int[n];
        ch = new int[n];
        answer = new int[n];
        temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        DFS(0);
    }
}
