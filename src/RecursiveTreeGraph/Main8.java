package RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8 {
    static int answer = 0;
    static int[] dis = {1,-1,5};
    static  int[] ch; //체크 배열
    static Queue<Integer> Q = new LinkedList<>();

    public static int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i<len ;i++) {
                int x = Q.poll();


                for (int j = 0; j < dis.length; j++) {
                    int nx = x+dis[j];

                    if(nx == e){//자식노드
                        return L+1;
                    }

                    if(nx>=1 && nx<=10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(BFS(s,e));

    }
}
