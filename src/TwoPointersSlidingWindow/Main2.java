package TwoPointersSlidingWindow;

import java.util.*;
public class Main2 {
    public static List<Integer> solution2(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if(a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            } else if(a[p1] < b[p2]){
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static List<Long> solution(int n1, int n2, List<Long> a, List<Long> b) {
        List<Long> answers = new ArrayList<>();

        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());

        int p1 = 0;
        int p2 = 0;
        while(p1 < n1 && p2 < n2) {
            if(a.get(p1).equals(b.get(p2))) {
                answers.add(a.get(p1));
                p1++;
                p2++;
            } else {
                if(a.get(p1) < b.get(p2)) {
                    p1++;
                } else {
                    p2++;
                }
            }
        }

        answers.sort(Comparator.naturalOrder());
        return answers;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Long> a = new ArrayList<>();


        /*for (int i = 0; i < n1; i++) {
            a.add(in.nextLong());
        }*/

        List<Long> b = new ArrayList<>();


        /*for (int i = 0; i < n2; i++) {
            b.add(in.nextLong());
        }*/
        /*List<Long> answers = solution(n1, n2, a, b);
        for (int i = 0; i < answers.size(); i++) {
            System.out.print(answers.get(i) + " ");
        }*/

        
        // 풀이
        int n1 = in.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }

        List<Integer> answers2 = solution2(n1, n2, arr1, arr2);

        for (int i = 0; i < answers2.size(); i++) {
            System.out.print(answers2.get(i) + " ");
        }



    }
}

/*
3
999999999 1000000000 5
5
999999999 1000000000 5 6 7




3awf
99999 10000 5
5
99999 10000 5 6 7
*/
