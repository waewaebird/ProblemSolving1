package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main4R {
    //가장 높은 탑 쌓기
    static class Brick implements Comparable<Brick> {
        int s; //넓이
        int h; //높이
        int w; //무게

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            return Integer.compare(o.s, this.s);
        }
    }

    public static int solution(List<Brick> arr) {
        //dy => i번쨰 벽돌을 제일 위에 쌓았을때의 높이

        Collections.sort(arr);

        int[] dy = new int[arr.size()];
        dy[0] = arr.get(0).h; //제일 밑에 있는 돌의 높이
        int answer = dy[0];

        for (int i = 1; i < arr.size(); i++) {
            int max_h = 0;
            for (int j = i-1; j >= 0; j--) {
                if(arr.get(j).w < arr.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Brick> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Brick(a,b,c));
        }

        System.out.println(solution(list));
    }

}
