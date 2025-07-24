package HashMapTreeSet.rev;

import java.util.*;

public class Main3RRRRRRRRR {
    // 매출액의 종류
    public static List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        int cnt = 0;

        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cnt++;

            maps.put(arr[i], maps.getOrDefault(arr[i],0) + 1);

            if(cnt == k) {
                answers.add(maps.size());

                int index = i-k+1;
                if(maps.get(arr[index]) > 1) {
                    int val = maps.get(arr[index]) - 1;
                    maps.put(arr[index],val);
                } else {
                    maps.remove(arr[index]);
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

        for(Integer x : solution(n,k,arr)) {
            System.out.print(x + " ");
        }
    }
}
