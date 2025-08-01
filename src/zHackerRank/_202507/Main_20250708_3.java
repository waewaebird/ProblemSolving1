package zHackerRank._202507;

import java.util.*;

public class Main_20250708_3 {
    // Queen's Attack II
    static class Point {
        int i;
        int j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return i == point.i && j == point.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }

    public static Integer solution(int n, int[] my, Set<Point> sets) {
        List<int[]> moves = new ArrayList<>();
        moves.add(new int[] {-1,-1});
        moves.add(new int[] {-1,0});
        moves.add(new int[] {-1,1});
        moves.add(new int[] {0,-1});
        moves.add(new int[] {1,1});
        moves.add(new int[] {1,0});
        moves.add(new int[] {1,-1});
        moves.add(new int[] {0,1});

        int answer = 0;

        for (int k = 0; k < 8; k++) {
            int tempI = my[0];
            int tempJ = my[1];

            int[] temp = moves.get(k);

            while(true) {
                tempI = tempI + temp[0];
                tempJ = tempJ + temp[1];

                boolean notIn = true;

                if(tempI >= 0 && tempI < n && tempJ >= 0 && tempJ < n) {
                    if(sets.contains(new Point(tempI, tempJ))) {
                        notIn = false;
                        break;
                    }
                } else {
                    break;
                }

                if(notIn) {
                    answer++;
                } else {
                    break;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int k = in.nextInt();

        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;

        int[] my = new int[] {a,b};


        Set<Point> sets = new HashSet<>();

        for (int i = 0; i < k; i++) {
            int fa = in.nextInt()-1;
            int fb = in.nextInt()-1;

            sets.add(new Point(fa,fb));
        }

        System.out.println(solution(n,my,sets));
    }
}
