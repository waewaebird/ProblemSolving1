package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main6RR {
    static int n;
    static int[] ch;

    public static void DFS(int v) {
        String temp = "";

        if(v == n+1) {
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1){
                    temp += i + " ";
                }
            }

            if(!temp.equals("")) {
                System.out.println(temp);
            }
        } else {
            ch[v] = 1;
            DFS(v+1);

            ch[v] = 0;
            DFS(v+1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        ch = new int[n+1];

        DFS(1);
    }
}
