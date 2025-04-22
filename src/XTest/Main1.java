package XTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    //가장 높은 탑 쌓기
    static class Top implements Comparable<Top> {
        int width;
        int height;
        int weight;

        public Top(int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Top o) {
            return Integer.compare(this.width, o.width);
        }
    }

    public static int solution(List<Top> list) {
        int answer = 0;
        Collections.sort(list);

        int[] dy = new int[list.size()+1];
        dy[0] = 0;

        for (int i = 1; i <= list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).weight > list.get(i-1).weight) {
                    dy[i] = Math.max(dy[i], list.get(j).height);
                }
            }
        }



        for(Top t : list) {

            System.out.println(t.width + " " + t.height + " " + t.weight);

        }


        for(int x : dy) {
            System.out.println(x);
        }



        return dy[2];
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Top> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Top(a,b,c));
        }

        System.out.println(solution(list));
    }

}
