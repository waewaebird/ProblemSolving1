package zHackerRank;

import java.util.*;

public class Main_20250902_1 {
    // Count Luck
    static class Point {
        int v1;
        int v2;

        public Point(int v1, int v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return v1 == point.v1 && v2 == point.v2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(v1, v2);
        }
    }

    public static String solution(int n, int m, Character[][] arr, int k, int startI, int startJ) {
        boolean isFind = false;

        int[][] ch = new int[n][m];
        Map<Point, Point> parent = new HashMap<>();

        String answer = "Oops!";

        int sum = 0;

        int[] DI = {-1,0,0,1};
        int[] DJ = {0,-1,1,0};

        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {startI, startJ});

        int endI = 0;
        int endJ = 0;

        while(!queue.isEmpty()) {
            if(isFind) {
                break;
            }

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] nows = queue.poll();

                int t0 = nows[0];
                int t1 = nows[1];

                ch[t0][t1] = 1;
                if(arr[t0][t1] == '.') {
                    for (int l = 0; l < 4; l++) {
                        int ni = t0 + DI[l];
                        int nj = t1 + DJ[l];
                        if(ni >= 0 && ni < n && nj >= 0 && nj < m) {
                            if(arr[ni][nj] == '.' || arr[ni][nj] == 'M' || arr[ni][nj] == '*') {
                                if(ch[ni][nj] == 0) {
                                    parent.put(new Point(ni,nj), new Point(t0,t1));
                                    if(arr[ni][nj] == '*') {
                                        endI = ni;
                                        endJ = nj;
                                        isFind = true;
                                        break;
                                    }

                                    ch[ni][nj] = 1;
                                    queue.offer(new int[] {ni,nj});
                                }
                            }
                        }
                    }

                } else if(arr[t0][t1] == 'M') {
                    for (int l = 0; l < 4; l++) {
                        int ni = t0 + DI[l];
                        int nj = t1 + DJ[l];
                        if(ni >= 0 && ni < n && nj >= 0 && nj < m) {
                            if(arr[ni][nj] == '.' || arr[ni][nj] == 'M' || arr[ni][nj] == '*') {
                                if(ch[ni][nj] == 0) {
                                    parent.put(new Point(ni,nj), new Point(t0,t1));
                                    if(arr[ni][nj] == '*') {
                                        endI = ni;
                                        endJ = nj;
                                        isFind = true;
                                        break;
                                    }

                                    ch[ni][nj] = 1;
                                    queue.offer(new int[] {ni,nj});
                                }
                            }
                        }
                    }
                }

                if(isFind) {
                    break;
                }
            }
        }

        Point obj = parent.get(new Point(endI, endJ));
        while(true) {
            if(obj == null) {
                break;
            }

            int t0 = Integer.valueOf(obj.v1);
            int t1 = Integer.valueOf(obj.v2);

            int cnt = 0;
            if(arr[t0][t1] == '.') {
                for (int l = 0; l < 4; l++) {
                    int ni = t0 + DI[l];
                    int nj = t1 + DJ[l];
                    if(ni >= 0 && ni < n && nj >= 0 && nj < m) {
                        if(arr[ni][nj] == '.' || arr[ni][nj] == 'M' || arr[ni][nj] == '*') {
                            cnt++;
                        }
                    }
                }
                if(cnt >= 3) {
                    sum++;
                }
            } else if(arr[t0][t1] == 'M') {
                for (int l = 0; l < 4; l++) {
                    int ni = t0 + DI[l];
                    int nj = t1 + DJ[l];
                    if(ni >= 0 && ni < n && nj >= 0 && nj < m) {
                        if(arr[ni][nj] == '.' || arr[ni][nj] == 'M' || arr[ni][nj] == '*') {
                            cnt++;
                        }
                    }
                }

                if(cnt >= 2) {
                    sum++;
                }
            }
            obj = parent.get(obj);
        }

        if(sum == k) {
            answer = "Impressed";
        }

        return answer;
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();

            Character[][] arr = new Character[n][m];

            int startI = 0;
            int startJ = 0;

            for (int j = 0; j < n; j++) {
                String str = in.next();
                for (int k = 0; k < m; k++) {
                    arr[j][k] = str.charAt(k);

                    if(arr[j][k] == 'M') {
                        startI = j;
                        startJ = k;
                    }
                }

            }

            int k = in.nextInt();

            answers.add(solution(n,m,arr,k,startI,startJ));
        }

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
