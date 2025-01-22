package HashMapTreeSet.rev;

import java.util.*;

public class Main3R {
    public static List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answers = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt] ,0) + 1);
            cnt++;

            if(cnt == k) {
                answers.add(map.size());
                if(map.get(arr[lt]) > 1) {
                    map.put(arr[lt], map.get(arr[lt])-1);
                } else {
                    map.remove(arr[lt]);
                }
                cnt--;
                lt++;
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(Integer i : solution(n,k,arr)) {
            System.out.print(i + " ");
        }

    }
}
