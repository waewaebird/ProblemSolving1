package HashMapTreeSet.rev;

import java.util.*;

public class Main3RRRRRRRRRRRR {
    // 매출액의 종류
    public static int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[n-k+1];

        Map<Integer,Integer> map = new HashMap<>();

        int index = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt++;

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if(cnt == k) {
                answer[index] = map.size();
                index++;

                if(map.get(arr[i-k+1]) > 1) {
                    map.put(arr[i-k+1], map.get(arr[i-k+1]) -1);
                } else if(map.get(arr[i-k+1]) == 1) {
                    map.remove(arr[i-k+1]);
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
