package HashMapTreeSet.rev;

import java.util.*;

public class Main3RRR {
    public static List<Integer> solution(int n, int k, int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            cnt++;

            if(cnt == k) {
                answer.add(hm.size());
                if(hm.get(arr[i-k+1]) == 1) {
                    hm.remove(arr[i-k+1]);
                } else {
                    hm.put(arr[i-k+1], hm.get(arr[i-k+1]) -1);
                }
                cnt--;
            }
        }
        return answer;
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
