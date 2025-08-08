package SortingAndSearching.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7RRRRRRR {
    // 좌표 정렬
    static class Matrix implements Comparable<Matrix> {
        int x;
        int y;

        public Matrix(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Matrix o) {
            int result = Integer.compare(this.x, o.x);

            if(this.x == o.x) {
                result = Integer.compare(this.y, o.y);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Matrix> list = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Matrix(a,b));
        }

        list.sort(null);
        for(Matrix m : list) {
            System.out.println(m.x + " " + m.y);
        }

    }
}
