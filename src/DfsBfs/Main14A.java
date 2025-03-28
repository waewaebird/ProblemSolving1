package DfsBfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main14A {
    // 피자집 6개중 4개 선택.
    // 15개
    // point 사용

    static int n,m,len,answer = Integer.MAX_VALUE;
    static int[] combi;
    static List<Point> pz,hs; //피자집, 집들의 좌표

    public void DFS(int L, int s) {
        if(L == m) {
            //for (int x : combi) {
            //pz 리스트의 인덱스가 들어가 있음.
            int sum = 0;

            for(Point h : hs) {
                int dis = Integer.MAX_VALUE;

                for(int i :combi) {
                    dis = Math.min(dis, Math.abs(h.x-pz.get(i).x) + Math.abs(h.y-pz.get(i).y));
                }
                sum += dis; //도시의 피자배달거리
            }

            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }


    public static void main(String[] args) {
        Main14A T = new Main14A();

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if(tmp == 1){
                    hs.add(new Point(i,j));
                } else if(tmp == 2) {
                    pz.add(new Point(i,j));
                }
            }
        }
        len = pz.size();
        combi = new int[m]; // len C m
        T.DFS(0,0);
        System.out.println(answer);
    }

}
