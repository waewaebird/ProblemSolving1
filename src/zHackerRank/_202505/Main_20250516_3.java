package zHackerRank._202505;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250516_3 {
    //Cats and a Mouse
    public static void solution(List<int[]> list) {
        for(int[] temp : list) {
            int a = Math.abs(temp[0] - temp[2]);
            int b = Math.abs(temp[1] - temp[2]);

            if(a == b) {
                System.out.println("Mouse C");
            } else if(a > b) {
                System.out.println("Cat B");
            } else if(b > a) {
                System.out.println("Cat A");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            list.add(new int[] {x,y,z});
        }

        solution(list);
    }
}
