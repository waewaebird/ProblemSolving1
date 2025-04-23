package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    static class Top implements Comparable<Top>{
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
            //return Integer.compare(o.width, this.width);
        }
    }


    public static int solution(List<Top> arr) {
        int answer = 0;
        Collections.sort(arr);
        int dy[] = new int[arr.size()];
        dy[0] = arr.get(0).height;
        answer = dy[0];
        for (int i = 1; i <= arr.size() ; i++) {
            int max_h = 0;
            for (int j = i-1; j >= 0 ; j--) {
                if(arr.get(j).weight > arr.get(i).weight && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h+arr.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static int solution(int n, List<Top> list) {
        int answer = Integer.MIN_VALUE;

        Collections.sort(list);

        int dy[] = new int[n];

        for (int i = 0; i < n; i++) {
            dy[i] = list.get(i).height;
        }

        for (int i = 1; i < n; i++) {
            int temp = 0;
            for (int j = i-1; j >= 0 ; j--) {
                if(list.get(i).weight > list.get(j).weight) {
                    temp = Math.max(dy[i] + dy[j], temp);
                }
            }
            dy[i] = Math.max(temp, dy[i]);
            answer = Math.max(dy[i], answer);
        }

        return answer;
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

        System.out.println(solution(n,list));

    }
}
