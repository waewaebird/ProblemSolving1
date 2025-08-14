import java.util.*;

public class JourneyScheduling {
    static Map<Integer, int[]> memo = new HashMap<>();
    static Map<Integer, int[]> smemo = new HashMap<>();

    public static void solution(int n, int m, List<List<Integer>> city, List<int[]> list) {
        for(int[] arr : list) {
            int start = arr[0];
            int count = arr[1];

            Long answer = 0L;
            int[] visited = new int[n+1];
            visited[start]++;

            int number = 0;
            Long[] ar = new Long[11];
            for (int C = 0; C < count; C++) {
                Deque<Integer> queue = new ArrayDeque<>();
                int[] dist = new int[n+1];
                int[] sArr = new int[n+1];

                dist[start] = 0;
                queue.offer(start);

                if (memo.get(start) == null) {
                    int level = 1;
                    while(!queue.isEmpty()) {
                        int len = queue.size();
                        for (int i = 0; i < len; i++) {
                            int now = queue.poll();
                            for(Integer temp : city.get(now)) {
                                if(dist[temp] == 0) {
                                    if(temp != start) {
                                        queue.offer(temp);
                                        dist[temp] = level;
                                        sArr[temp] = level;
                                    }
                                }
                            }
                        }
                        level++;
                    }
                    memo.put(start, dist);
                    Arrays.sort(sArr);
                    smemo.put(start, sArr);
                } else {
                    dist = memo.get(start);
                    sArr = smemo.get(start);
                }


                List<Integer> samples = new ArrayList<>();
                answer += sArr[dist.length-1];
                for (int i = 0; i <= n; i++) {
                    if(dist[i] == sArr[dist.length-1]) {
                        samples.add(i);
                    }
                }

                if(samples.size() == 1) {
                    start = samples.get(0);
                    visited[samples.get(0)]++;
                } else {
                    //samples.sort(null);
                    int index = 0;
                    int visit = Integer.MIN_VALUE;
                    for(int x : samples) {
                        if(visited[x] > visit) {
                            if(visit == Integer.MIN_VALUE) {
                                index = x;
                                visit = visited[x];
                                break;
                            }
                        }
                    }
                    start = index;
                    visited[index]++;
                }

                ar[C] = answer;

                if(C == 7) {
                    number = (int) (ar[7] - ar[6]);
                    break;
                }

            }

            if(number > 0) {
                System.out.println((long)number * (long)(count- 8) + answer);
            } else {
                System.out.println(answer);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<List<Integer>> city = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            city.add(new ArrayList<>());
        }

        for (int i = 0; i < n-1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            city.get(a).add(b);
            city.get(b).add(a);
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new int[] {a,b});
        }

        solution(n, m, city, list);
    }

}
