package SortingAndSearching;

import java.util.*;

class Point implements Comparable<Point>{
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) {
            return this.y-o.y; // this객체 - 비교대상 o : -> 음수값이 리턴되도록 오름차순
                               //  10       -      20
                               // o - this : 음수값이 리턴!
        } else {
            return this.x - o.x;
        }
    }
}

public class Main7 {

    public static List<Matrix> solution(int n, List<Matrix> list) {

        Collections.sort(list, new Comparator<Matrix>() {
            @Override
            public int compare(Matrix o1, Matrix o2) {
                if(o1.x - o2.x == 0){
                    return o1.y - o2.y;
                } else {
                    return o1.x - o2.x;
                }

            }
        });

        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Matrix> list = new ArrayList<>();
        List<Point> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x= in.nextInt();
            int y= in.nextInt();
            list.add(new Matrix(x,y));
            arr.add(new Point(x,y));
        }

        Collections.sort(arr);
        for(Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }

        for (Matrix matrix : solution(n, list)) {
            System.out.println(matrix.x + " " + matrix.y);
        }

    }

    public static class Matrix {
        int x;
        int y;

        public Matrix(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
