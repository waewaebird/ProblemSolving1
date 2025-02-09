package SortingAndSearching.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7R {
    public static class Matrix implements Comparable<Matrix>{
        int x;
        int y;

        public Matrix(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Matrix o) {
            if(this.x - o.x == 0) {
                return this.y - o.y;
            }
            return this.x - o.x;
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Matrix> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            list.add(new Matrix(x,y));
        }

        Collections.sort(list);

        for(Matrix m : list) {
            System.out.println(m.x + " " + m.y);
        }

    }
}
