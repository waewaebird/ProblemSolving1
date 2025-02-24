package DfsBfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    static int n;
    static int[] arr;
    boolean flag = false;
    static int total = 0;
    static String answer = "NO";

    static List<Integer> answers = new ArrayList<>();

    public static void DFS(int v) {
        if(v == n) {
            int a = 0;
            int b = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] > 0 ) {
                    a += arr[i];
                } else {
                    b += arr[i];
                }
            }

            if(a == (b*-1)) {
                answers.add(1);
            }

        } else {
            arr[v] = arr[v]*1;
            DFS(v+1);

            arr[v] = arr[v]*-1;
            DFS(v+1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        DFS(0);

        if(answers.size() > 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


   public void DFS(int L, int sum, int[] arr) {
        if(flag == true) {
            return;
        }

        if(L == n) {
            if((total-sum)==sum) {
                answer="YES";
                flag = true;
            }

        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main1(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total+=arr[i];
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }


}

