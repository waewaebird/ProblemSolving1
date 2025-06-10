package SortingAndSearching.rev;

import java.util.*;

public class Main4R {
    // Least Recently Used
    public static int[] solution(int s, int n, int[] arr) {
        int[] ch = new int[1001];
        int[] answer = new int[s];

        for(int x : arr) {
            int index = s-1;
            if(ch[x] >= 1){
                for (int i = 0; i < s; i++) {
                    if(answer[i] == x) {
                        index = i;
                    }
                }
            }
            ch[x]++;
            for (int i = index; i >= 1; i--) {
                if(i == s-1) {
                    ch[answer[i]] = 0;
                }
                answer[i] = answer[i-1];
            }
            answer[0] = x;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(s,n,arr)) {
            System.out.print(x + " ");
        }
    }
}
