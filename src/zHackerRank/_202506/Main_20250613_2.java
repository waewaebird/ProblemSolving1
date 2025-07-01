package zHackerRank._202506;

import java.util.*;

public class Main_20250613_2 {
    static long N;
    static int K;
    static Integer[] arr;
    static List<List<Integer>> answers = new ArrayList<>();
    static int[] ch;
    static int min = Integer.MAX_VALUE;
    static Map<Long, Integer> memo = new HashMap<>();

    public static void DFS(long v) {
        int firstCnt = 0;

        for(int x : ch) {
            firstCnt += x;
        }

        if(memo.containsKey(v) && memo.get(v) <= firstCnt) {
            return;
        }

        memo.put(v, firstCnt);

        if(firstCnt > min) {
            return;
        }

        if(v == N) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < K; i++) {
                if(ch[i] >= 1) {
                    for (int j = 0; j < ch[i]; j++) {
                        temp.add(arr[i]);
                    }
                }
            }

            if(temp.size() <= min) {
                min = temp.size();
                Collections.sort(temp);
                answers.add(temp);
            }
        }

        if(v > N) {
            return;
        } else {
            for (int i = 0; i < K; i++) {
                ch[i]++;
                DFS(v * arr[i]);
                ch[i]--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        K = in.nextInt();

        arr = new Integer[K];
        ch = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        DFS(1);

        if(answers.size() == 0) {
            System.out.println(-1);
        } else {
            List<List<Integer>> real = new ArrayList<>();
            for(List<Integer> temp : answers) {
                if(temp.size() == min) {
                    real.add(temp);
                }
            }

            int index = 0;
            while(index < min) {
                int mini = Integer.MAX_VALUE;

                for(List<Integer> temp : real) {
                    mini = Math.min(temp.get(index), mini);
                    if(mini == 2) {
                        break;
                    }
                }

                List<List<Integer>> realreal = new ArrayList<>();
                for (int i = 0; i < real.size(); i++) {
                    if(real.get(i).get(index) == mini) {
                        realreal.add(real.get(i));
                    }
                }
                real = null;
                real = realreal;
                index++;
            }

            StringBuilder sb = new StringBuilder("1 ");
            int cal = 1;

            for (int i = 0; i < min; i++) {
                cal = cal * real.get(0).get(i);

                sb.append(cal + " ");
            }

            System.out.println(sb);

        }
    }
}
