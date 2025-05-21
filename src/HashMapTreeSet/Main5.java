package HashMapTreeSet;


import java.util.*;

public class Main5 {
    public static int solution2(int n, int k, int[] arr) {
        //TreeSet 정렬, 중복제거
        Set<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    Tset.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        int cnt = 0;
        // Tset.remove(143); //  지우기
        // Tset.size(); // 사이즈
        // System.out.println(Tset.first());
        // System.out.println(Tset.last());

        for(int x : Tset){
            System.out.println(x);
            cnt++;
            if(cnt == k) {
                return x;
            }
        }
        return -1;
    }


    public static int solution(int n, int k, int[] arr) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    map.put(arr[i]+arr[j]+arr[l], map.getOrDefault(arr[i]+arr[j]+arr[l], 0) + 1);
                }
            }
        }

        List<Integer> temp = new ArrayList<>();

        for(Integer key : map.keySet()) {
            temp.add(key);
        }
        temp.sort(Comparator.reverseOrder());

        if(temp.size() < k-1) {
            return -1;
        } else {
            return temp.get(k-1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }
}
