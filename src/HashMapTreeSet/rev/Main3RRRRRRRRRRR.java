package HashMapTreeSet.rev;

import java.util.*;

public class Main3RRRRRRRRRRR {
    // 매출액의 종류
    public static List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        Map<Integer, Integer> maps = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            maps.put(arr[i], maps.getOrDefault(arr[i], 0) + 1);
            cnt++;

            if(cnt == k) {
                answers.add(maps.size());

                if(maps.get(arr[i-k+1]) == null || maps.get(arr[i-k+1]) == 1) {
                    maps.remove(arr[i-k+1]);
                } else {
                    maps.put(arr[i-k+1], maps.get(arr[i-k+1]) - 1);
                }
                cnt--;
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(n,k,arr)) {
            System.out.print(x + " ");
        }
    }
}
