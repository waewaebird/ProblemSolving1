package GreedyAlgorithm;

import java.util.*;

public class Main6A {
    static int[] unf; //들어온 숫자 집합.(학생번호 index, 배열값은 집합의 번호)
    
    //FIND  UNION 메소드 걍 외워라
    public static int Find(int v) {
        if(v==unf[v]) { //인덱스번호와 배열값이 같으면, v학생을 return == 집합번호를 reuturn
            return v;//집합번호
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        unf= new int[n+1]; //숫자 9번학생까지
        for (int i = 1; i <= n ; i++) {
            unf[i] = i; //초기화 각각의 집합숫자를 넣어줌 , 집합의 번호를 각자가 갖고 있다.
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
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
    }
}
