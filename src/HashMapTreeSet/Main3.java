package HashMapTreeSet;

import java.util.*;

/*
*
7 4
20 12 20 10 23 17 10
*
*
20 12 20 10  20:2 12:1 10:1
12 20 10 23  20:1 12:1 10:1 23:1
20 10 23 17  20:1 10:1 23:1 17:1
10 23 17 10  10:2 23:1 17:1
*
* *
* */
public class Main3 {
    public static List<Integer> solution2(int n, int k, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> HM = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());

            HM.put(arr[lt], HM.get(arr[lt]-1));
            if(HM.get(arr[lt]) == 0) {
                HM.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt++;
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if(cnt == k) {
                answers.add(map.size());
                map.put(arr[i-k+1], map.get(arr[i-k+1])-1);
                if(map.get(arr[i-k+1]) == 0) {
                    map.remove(arr[i-k+1]);
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

        for(Integer aa : solution(n,k,arr)) {
            System.out.print(aa + " ");
        }

    }
}
