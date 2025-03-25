package HashMapTreeSet.rev;

import java.util.*;

public class Main3RR {

    public static List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            cnt++;
            if(cnt == k) {
                answers.add(map.size());
                if(map.get(arr[i-k+1]) == 1) {
                    map.remove(arr[i-k+1]);
                } else {
                    map.put(arr[i-k+1] ,map.get(arr[i-k+1])-1);
                }
                cnt = cnt-1;
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
