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
    public static String solution(List<Relation> list, int n, int m, int one, int two) {
        String answer = "";

        int[] arr = new int[n+1];

        List<Integer> deleted = new ArrayList<>();

        List<Integer> my = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if(list.get(i).me == one) {
                my.add(list.get(i).you);
                deleted.add(i);
            } else if(list.get(i).you == one) {
                my.add(list.get(i).me);
                deleted.add(i);
            }
        }

        deleted.sort(Comparator.naturalOrder());

        for (Integer x : deleted) {
            System.out.println(list.remove((int) x));
        }

        /*while(true) {
            boolean isAdd = false;
            for(Integer x : my) {
                for(Relation r : list) {
                    if(r.me == x) {
                        my.add(r.you);
                        isAdd = true;
                    }

                    if(r.you == x) {
                        my.add(r.me);
                        isAdd = true;
                    }
                }
            }
            if(isAdd == false) {
                break;
            }
        }*/









        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<Relation> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Relation(a,b));
        }

        int one = in.nextInt();
        int two = in.nextInt();

        System.out.println(solution(list,n,m,one,two));
    }
}
