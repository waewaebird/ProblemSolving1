package SortingAndSearching.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7RRR {
    static class Matrix implements Comparable<Matrix>{
        int x;
        int y;

        public Matrix(int x, int y) {
            this.x = x;
            this.y = y;
        }


        @Override
        public int compareTo(Matrix o) {
            if(this.x == o.x) {
                return Integer.compare(this.y,o.y);
            } else {
                return Integer.compare(this.x,o.x);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Matrix> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Matrix(a,b));
        }

        Collections.sort(list);

        for (Matrix temp : list) {
            System.out.println(temp.x + " " + temp.y);
        }
    }
}
