package HashMapTreeSet.rev;

import java.util.*;

public class Main5R {
    // K번째 큰 수
    static int N;
    static int K;
    static int[] arr;
    static List<Integer> answers = new ArrayList<>();
    static int[] combi = new int[3];

    public static void DFS(int v, int start) {
        if(v == 3) {
            int sum = 0;
            for(int x : combi) {
                sum += x;
            }

            if(!answers.contains(sum)) {
                answers.add(sum);
            }
        } else {
            for (int i = start; i < N; i++) {
                combi[v] = arr[i];
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        K = in.nextInt();

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0,0);

        Collections.sort(answers);

        if(answers.size() < K) {
            System.out.println(-1);
        } else {
            System.out.println(answers.get(answers.size() - K));
        }
    }
}
