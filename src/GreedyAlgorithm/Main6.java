package GreedyAlgorithm;

import java.util.*;

class Relation {
    int me;
    int you;

    public Relation(int me, int you) {
        this.me = me;
        this.you = you;
    }
}

public class Main6 {
    static int[] unf; //들어온 숫자 집합.(학생번호 index, 배열값은 집합의 번호)

    
    //FIND  UNION 메소드 걍 외워라
    public static int Find(int v) {
        if(v==unf[v]) {
            return v;
        } else {
            return unf[v] = Find(unf[v]); //경로 압축
        }
    }

    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) {
            unf[fa] = fb;
        }
    }

    // 두 집합이 공통원소가 없는게 서로소
    public static String solution(List<Relation> list, int n, int m, int one, int two) {
        String answer = "";

        int[] ch = new int[m+1];

        List<Integer> my = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            if(list.get(i).me == one) {
                my.add(list.get(i).you);
                queue.add(list.get(i).you);
                ch[i] = 1;
            } else if(list.get(i).you == one) {
                my.add(list.get(i).me);
                queue.add(list.get(i).me);
                ch[i] = 1;
            }
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < m; i++) {
                if(ch[i] == 0) {
                    if(list.get(i).me == now) {
                        my.add(list.get(i).you);
                        queue.add(list.get(i).you);
                        ch[i] = 1;
                    } else if(list.get(i).you == now) {
                        my.add(list.get(i).me);
                        queue.add(list.get(i).me);
                        ch[i] = 1;
                    }
                }
            }
        }

        if(my.contains(two)) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<Relation> list = new ArrayList<>();

        unf= new int[n+1]; //숫자 9번학생까지
        for (int i = 1; i <= n ; i++) {
            unf[i] = i; //초기화 각각의 집합숫자를 넣어줌
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Relation(a,b));
            Union(a,b); //a와 b를 한집합으로 만들어라
        }

        int one = in.nextInt();
        int two = in.nextInt();

        int fa = Find(one); //f3 = 5
        int fb = Find(two); //f8 = 9

        if(fa == fb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // 4 4 4 5 5 7 8 9 9
        System.out.println(solution(list,n,m,one,two));
    }
}
